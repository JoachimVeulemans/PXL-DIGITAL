import random
from board import Board, BOARDSIZE

class Brain:

    def __init__(self, board, depth, turn=2):
        super().__init__()
        self.board = board
        self.depth = depth  
        self.my_turn = turn  
        self.pruning = True
        self.prune_num = 0

    # Main function, fires up the calculation
    def calculateMove(self):
        
        move = 0
        if self.depth == 0:
            move =  self.randomMove()
        else:
            self.prune_num = 0
            move = self.bestMove(0, self.my_turn, self.pruning, -100000, 100000)
        return move
		
    # Random move ('dummy' difficulty)
    def randomMove(self):
        r = random.randint(0, BOARDSIZE[1]-1)
        while self.board.isFull(r):
            r = random.randint(0, BOARDSIZE[1]-1)
        return r

    '''
    TODO
    Improvements:
    - heuristic: check if patterns can be completed (only if there's a piece beneath open spot in pattern)
    - certain loss: don't do something random but at least block 1 winning configuration (now: AI gives up an says so in logs)
    - when a block MUST be done to avoid losing > decide faster
    - make it faster!
    '''

    # Bring the madness
    def bestMove(self, pdepth, turn, prune, alpha, beta):
        depth = pdepth + 1

        turnfactor = 1
        if not turn == self.my_turn:
            turnfactor = -1

        # If max depth is reached (end-nodes of tree), calculate score of config
        if depth > self.depth:
            return self.board.heuristic(self.my_turn, self.otherPlayer(self.my_turn)) # turns were switched calling this function, but we're calculating score after last move

        score = 0
        child_score = 0
        max_score = 0
        move = -1
        winning_configs = 0
        size = BOARDSIZE[1]
        start = random.randint(0, size-1)  # random start

        for it in range(0, size):
            i = (start+it)%size

            if not self.board.isFull(i):
                self.board.dropPiece(i, turn) # simulate turn (undo it when done)
                winningMove = self.board.testForWin(turn, i)
                
                if winningMove == None: # not a winnning move
                    child_score = self.bestMove(depth, self.otherPlayer(turn), prune, alpha, beta)
                    self.board.resetValue(i)
                else: # player on turn won the game
                    self.board.resetValue(i)
                    child_score = 1000 * turnfactor

                    # keep track of possible winning outcomes
                    winning_configs += 1     
                
                if turn == self.my_turn: # max node, look for max child score
                    if self.pruning: 
                        # PRUNING TIME; prune all remaining branches if best node is over the lowest node in level above
                        # why? node above is a min node, so it won't select this anyway (assuming humans are smart [HA-HA-MACHINES-WILL-PREVAIL])
                        if child_score > alpha:
                            alpha = child_score
                        if alpha >= beta:
                            self.prune_num += (size-it) * pow(size, (self.depth-depth))
                            return child_score
                    
                    if move == -1 or child_score > score:
                        score = child_score
                        move = i
                    '''elif child_score == score:
                        # score tied, choose randomly EDIT not needed, random is already added in start of loop
                        if random.uniform(0, 1) < 0.5: # < 1/size?
                            move = i'''
                else: # min node, look for worst move for AI
                    if self.pruning: 
                        # PRUNING TIME; prune all remaining branches if worst node is below highest node in level above
                        # why? node above is a max node, so it won't select this anyway (assumin humans are smart [HA-HA-MACHINES-WILL-PREVAIL])
                        if child_score < beta:
                            beta = child_score
                        if beta <= alpha:
                            self.prune_num += (size-it) * pow(size, (self.depth-depth))
                            return child_score

                    if move == -1 or child_score < score:
                        score = child_score
                        move = i
                    '''elif child_score == score:
                        # score tied, choose randomly EDIT not needed, random is already added in start of loop
                        if random.uniform(0, 1) < 0.5: # < 1/size?
                            move = i'''

        if depth == 1: # Top level reached, return move we found (if valid)
            if not move == -1:
                return move
            else:
                print("AI: No valid move found")
        else:
            # Give priority to fast finishing if we're winning, or lower depth losses (finish fast & stall the game when loss is [almost - humans make mistakes] certain)
            # my turn: return score-depth (lower score for higher depth), other turn: return score+depth (higher score for higher depth)
            return (score + (depth*turnfactor*-1))                

    # Get other player number in the Brain's simulation
    def otherPlayer(self, turn):
        return (turn % 2) + 1