import sys
import numpy as np

BOARDSIZE = (6,7)

class Board():

    board = None

    def __init__(self):
        super().__init__()        
        self.initBoard()

    def initBoard(self):
        self.board = np.zeros(BOARDSIZE, dtype=int)

    def reset(self):
        self.initBoard()

    def dropPiece(self, col, piece):
        ins = -1
        for i, row in enumerate(self.board):
            if self.board[i][col] == 0:
                ins = i

        if ins >= 0:
            self.board[ins][col] = piece
            return True
        else:
            return False

    def getPieceAt(self, row, col):
        return self.board[row][col]

    def print(self):
        for row in self.board:
            for col in row:
                sys.stdout.write(str(col) + " ")
            print("")
        print("")

    def isFull(self, col):
        return (self.board[0][col] != 0)

    def completed(self):
        for c in range(0, BOARDSIZE[1]):
            if not self.isFull(c):
                return False
        return True

    # Returns last dropped piece for given column
    def last_dropped_at(self, col):
        for r in range(0, BOARDSIZE[0]):
            if not self.board[r][col] == 0:
                return (r, col)
        return None

    # Test if a winning config appeared after last move
    # Returns None if not
    # Returns (pos_row, pos_col, delta_row, delta_col) if found => start of winning config + direction
    def testForWin(self, turn, col):
        # First find drop index (row, col)
        row = -1
        for r in range(0, BOARDSIZE[0]):
            if self.board[r][col] == turn:
                row = r
                break
        
        # Check all directions from inserted piece
        # Horizontal
        area = self.board[row][:]
        patternFound = self.checkForPattern(area, turn)
        if patternFound >= 0:
            return (row, patternFound, 0, 1)

        # Vertical
        start = max(row-3, 0)
        end = min(row+4, BOARDSIZE[0])
        area = []
        for i in range(start, end):
            area.append(self.board[i][col])
        patternFound = self.checkForPattern(area, turn)
        if patternFound >= 0:
            return (patternFound, col, 1, 0)

        # Diagonal 1 (top left to bottom right)
        area = []
        startOffset = min(3, row, col)
        endOffset = min(4, (BOARDSIZE[0] - row), (BOARDSIZE[1] - col))

        for x in range(startOffset*-1, endOffset):
            area.append(self.board[row+x][col+x])
        patternFound = self.checkForPattern(area, turn)
        if patternFound >= 0:
            return ((row+(startOffset*-1)+patternFound), (col+(startOffset*-1)+patternFound), 1, 1)

        # Diagonal 2 (top right to bottom left)
        area = []
        startOffset = min(3, row, (BOARDSIZE[1] - col - 1))
        endOffset = min(4, (BOARDSIZE[0] - row), col + 1)

        for x in range(startOffset*-1, endOffset):
            area.append(self.board[row+x][col-x])
        patternFound = self.checkForPattern(area, turn)
        if patternFound >= 0:
            return ((row+(startOffset*-1)+patternFound), (col-(startOffset*-1)-patternFound), 1, -1)

        return None

    def checkForPattern(self, area, turn):
        count = 0
        start = -1
        i = 0
        for piece in area:
            if piece == turn:
                if count == 0:
                    start = i
                count += 1
            else:
                count = 0
            if count == 4:
                return start
            i += 1
        return -1

    # Finds occurrences of given patterns in state string and counts score
    def scoreForPatterns(self, state, patterns, scores):
        score = 0
        for i in range(0, len(patterns)):
            os = score
            pattern = patterns[i]
            if state.find(pattern) >= 0:
                score += scores[i]
            if state[::-1].find(pattern) >= 0:
                score += scores[i]
                
        return score

    # Quantify board; occurrences of eXXXe, XXXe and eXXX, XXeX and XeXX
    def heuristic(self, turn, other_turn):
        # offensive patterns
        pattern1 = "0" + (str(turn) * 3) # -XXX in some way (-XXX- gets counted double >>> ultra dangerous config!)
        pattern2 = str(turn) + "0" + (str(turn) * 2) # X-XX in some way moderate danger      
        
        # defensive patterns
        pattern3 =  "0" + (str(other_turn) * 3) 
        pattern4 = str(other_turn) + "0" + (str(other_turn) * 2) 

        patterns = [ pattern1, pattern2, pattern3, pattern4 ]
        scores = [10, 10, -15, -15] # prioritize defending, or the game is over

        count = 0
        
        # Horizontal
        for r in range(0, BOARDSIZE[0]):
            row = ""
            for c in range(0, BOARDSIZE[1]):
                row += str(self.board[r][c])
            count += self.scoreForPatterns(row, patterns, scores)

        # Vertical
        for c in range(0, BOARDSIZE[1]):
            col = ""
            for r in range(0, BOARDSIZE[0]):
                col += str(self.board[r][c])
            count += self.scoreForPatterns(col, patterns, scores)
            
        # Diagonal 1 (top right to bottom left)
        for c in range(0, BOARDSIZE[1]):
            diag = ""
            limit = min(c+1, BOARDSIZE[0])
            for cx in range(0, limit):
                diag += str(self.board[cx][c-cx])
            count += self.scoreForPatterns(diag, patterns, scores)
        for r in range(1, BOARDSIZE[0]):
            diag = ""
            for rx in range(0, BOARDSIZE[0]-r):
                diag += str(self.board[r+rx][BOARDSIZE[1]-1-rx])
            count += self.scoreForPatterns(diag, patterns, scores)

        # Diagonal 2
        for r in range(0, BOARDSIZE[0]):
            diag = ""
            for rx in range(0, BOARDSIZE[0]-r):
                diag += str(self.board[r+rx][rx])
            count += self.scoreForPatterns(diag, patterns, scores)
        for c in range(1, BOARDSIZE[1]):
            diag = ""
            limit = min(BOARDSIZE[1]-c, BOARDSIZE[0])
            for cx in range(0, limit):
                diag += str(self.board[cx][c+cx])
            count += self.scoreForPatterns(diag, patterns, scores)

        return count

    def resetValue(self, col):
        for i in range(0, BOARDSIZE[0]):
            if self.board[i][col] != 0:
                self.board[i][col] = 0
                break