import sys
import numpy as np
from functools import partial
from PyQt5.QtWidgets import QApplication, QWidget, QSystemTrayIcon, QPushButton, QDesktopWidget, QLabel, QAction, QMainWindow
from PyQt5.QtGui import QIcon, QImage, QPainter
from PyQt5.QtCore import QPointF, Qt
from board import Board, BOARDSIZE
from brain import Brain
from difficulty import Difficulty

SQUARESIZE = 100

class Four(QMainWindow):
    def __init__(self, board):
        super().__init__()
        self.board = board
        self.gameover = False
        self.difficulty = Difficulty.MEDIUM
        self.players = [
            {"name": "Player", "ai": False, "piece": 1},
            {"name": "AI", "ai": True, "brain": Brain(board, self.difficulty.value), "piece": 2},
        ]
        self.currentPlayer = -1

        self.initUI()

        self.startNextTurn()

    def initUI(self):        
        self.setGeometry(0, 0,1280, 760)
        self.center()
        self.setWindowTitle('FOUR')
        self.setWindowIcon(QIcon('assets/icon.png'))  

        mainMenu = self.menuBar()
        gameMenu = mainMenu.addMenu('Game')

        newGameButton = QAction(QIcon('assets/reload.png'), 'Restart', self)
        newGameButton.setShortcut('Ctrl+R')
        newGameButton.setStatusTip('Restart')
        newGameButton.triggered.connect(partial(self.restart, self.difficulty))
        gameMenu.addAction(newGameButton)

        exitButton = QAction(QIcon('assets/exit.png'), 'Exit', self)
        exitButton.setShortcut('Ctrl+Q')
        exitButton.setStatusTip('Exit game')
        exitButton.triggered.connect(self.close)
        gameMenu.addAction(exitButton)

        self.difficulylabel = QLabel(self)
        self.difficulylabel.setStyleSheet("font-family: Roboto, sans-serif; font-size: 30px;")
        self.difficulylabel.setText("Opponent: " + self.difficulty.name.upper())
        self.difficulylabel.resize(450, 40)
        self.difficulylabel.move(780, 110)

        self.logbox = QLabel(self)
        self.logbox.setStyleSheet("font-family: Consolas, sans-serif; font-size: 15px; border: 1px solid grey; border-radius: 2px;")
        self.logbox.resize(450, 540)
        self.logbox.move(780, 160)
        self.logbox.setAlignment(Qt.AlignTop)

        self.statsbox = QLabel(self)
        self.statsbox.setStyleSheet("font-family: Consolas, sans-serif; border-top: 1px solid grey;")
        self.statsbox.resize(1280, 40)
        self.statsbox.move(0, 720)
        self.update_stats()

        self.marked_cells = []
        self.drawRowButtons()
        self.drawDifficultyButtons()
                
        self.log("Game started on difficulty %s\t[Depth: %d]" % (self.difficulty.name, self.difficulty.value))

        self.show()

    # Draw buttons to add a piece to a column
    def drawRowButtons(self):
        for i in range(0, BOARDSIZE[1]):
            btn = QPushButton('V', self)
            btn.setToolTip('Drop piece')
            btn.resize(SQUARESIZE-20, 40)
            btn.move(10+(SQUARESIZE*i)+10, 40)     
            btn.clicked.connect(partial(self.drop, i))

    # Draw buttons to start new game with chosen difficulty
    def drawDifficultyButtons(self):
        i = 0
        for d in Difficulty:
            btn = QPushButton(d.name, self)
            btn.setToolTip("Start " + d.name)
            btn.resize(SQUARESIZE-20, 40)
            btn.move(780 + ((SQUARESIZE-8)*i), 40)
            btn.clicked.connect(partial(self.restart, d))
            i += 1

    # Center window
    def center(self):      
        qr = self.frameGeometry()
        cp = QDesktopWidget().availableGeometry().center()
        qr.moveCenter(cp)
        self.move(qr.topLeft())

    # Start a new game
    def restart(self, newdiff=None):
        if not self.gameover:
            self.log("Game aborted.")

        if not newdiff == None:
            self.difficulty = newdiff
            self.update_stats()
            self.difficulylabel.setText("Opponent: " + self.difficulty.name.upper())

        self.board.reset()
        self.gameover = False
        self.players[1]["brain"] = Brain(board, self.difficulty.value)
        self.currentPlayer = -1
        self.repaint()
        self.log("New game started on difficulty %s\t[Depth: %d]" % (self.difficulty.name, self.difficulty.value))
        self.startNextTurn()
    
    # Log given message to the logbox (right side of window)
    def log(self, msg):
        if not msg == None and not msg == "":
            self.logbox.setText(msg + "\n" + self.logbox.text())

    # Drop piece of current player in given col
    def drop(self, col):
        if self.gameover:
            return

        current_player = self.players[self.currentPlayer]
        pieceDropped = self.board.dropPiece(col, current_player["piece"])

        if pieceDropped:
            # Print drop in logbox
            logline = current_player["name"] + ": drop @ " + str(col)
            if current_player["ai"] == True:
                logline += "\t\t[Pruned " + str(current_player["brain"].prune_num) + " branches]"
            self.log(logline)

            self.marked_cells = [self.board.last_dropped_at(col)]
            self.repaint()
            self.onTurnEnded(col)

    def onTurnEnded(self, col):
        # check for game over
        winning_config = self.board.testForWin(self.players[self.currentPlayer]["piece"], col)
        self.gameover = (not winning_config == None)
        if self.gameover:
            self.mark_cells(winning_config)
            self.log("\nWINNER: " + self.players[self.currentPlayer]["name"] + "\n")  
            if self.players[self.currentPlayer]["ai"] == True:
                self.add_ai_stat(1,0,0)
            else:
                self.add_ai_stat(0,0,1)
        elif self.board.completed(): # tie game
            self.gameover = True
            self.marked_cells = []
            for r in range(BOARDSIZE[0]):
                for c in range(BOARDSIZE[1]):
                    self.marked_cells.append((r, c))
            self.log("\nIT'S A TIE!\n")  
            self.add_ai_stat(0,1,0)
        else:
            self.startNextTurn()

    # Select next player as current player and execute AI move when needed
    def startNextTurn(self):
        self.currentPlayer = (self.currentPlayer + 1) % len(self.players)

        if self.players[self.currentPlayer]["ai"]:
            ai_brain = self.players[self.currentPlayer]["brain"]
            next_move = ai_brain.calculateMove()
            self.drop(next_move) 

    # Mark winning cells when game has ended
    def mark_cells(self, cells):
        self.marked_cells = []
        for i in range(0, 4):
            self.marked_cells.append((cells[0]+cells[2]*i, cells[1]+cells[3]*i))

        self.log("Winning configuration found: %s -> %s" % (str(self.marked_cells[0]), str(self.marked_cells[-1])))
        self.repaint()

    # Redraw the grid
    def paintEvent(self, event):
        qp = QPainter()
        qp.begin(self)
        for row in range(0, BOARDSIZE[0]):
            for col in range(0, BOARDSIZE[1]):
                if self.board.getPieceAt(row, col) == 1:
                    if self.marked_cells.__contains__((row, col)):
                        qp.drawImage(QPointF(10+col*SQUARESIZE,100+row*SQUARESIZE), QImage("assets/square_red_special.png"))
                    else:
                        qp.drawImage(QPointF(10+col*SQUARESIZE,100+row*SQUARESIZE), QImage("assets/square_red.png"))
                elif self.board.getPieceAt(row, col) == 2:
                    if self.marked_cells.__contains__((row, col)):
                        qp.drawImage(QPointF(10+col*SQUARESIZE,100+row*SQUARESIZE), QImage("assets/square_yellow_special.png"))
                    else:
                        qp.drawImage(QPointF(10+col*SQUARESIZE,100+row*SQUARESIZE), QImage("assets/square_yellow.png"))
                else:
                    qp.drawImage(QPointF(10+col*SQUARESIZE,100+row*SQUARESIZE), QImage("assets/square.png"))
        qp.end()

    # Stats
    def add_ai_stat(self, win, tie, loss):
        self.stats[self.difficulty.name][0] += win
        self.stats[self.difficulty.name][1] += tie
        self.stats[self.difficulty.name][2] += loss

        self.write_stats()
        self.update_stats()

    def update_stats(self):
        self.read_stats()
        diffstats = self.stats[self.difficulty.name]
        self.statsbox.setText("\tDifficulty: %s\tAI wins: %d\tTies: %d\t\tAI losses: %d" % (self.difficulty.name, diffstats[0], diffstats[1], diffstats[2]))

    def write_stats(self):
        file = open("stats.sam","w")
        for s in self.stats:
            file.write(s+"$"+str(self.stats[s][0])+"$"+str(self.stats[s][1])+"$"+str(self.stats[s][2])+"\n")
        file.close()

    def read_stats(self):
        self.stats = {}
        with open('stats.sam') as fp:
            for line in fp:
                stats = line.split("$")
                self.stats[stats[0]] = [int(stats[1]), int(stats[2]), int(stats[3])]

if __name__ == '__main__':
    app = QApplication(sys.argv)

    board = Board()
    game = Four(board)
    
    sys.exit(app.exec_())   