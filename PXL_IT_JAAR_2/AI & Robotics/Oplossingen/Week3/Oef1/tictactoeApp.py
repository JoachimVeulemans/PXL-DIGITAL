#! /usr/bin/python3

from src.CourseMaterials.Week3.Oef1.board import Board
depthBound = 2


def maximizer(depth):
    test = 5


def minimizer(depth):
    test = 5


def eval(board, depth):
    if maximizer(depth):
        return 10 - depth
    elif minimizer(depth):
        return depth - 10
    else:
        return 0


def miniMax(board, depth):
    if depth == depthBound:
        return eval(board)
    elif maximizer(depth):
        #for each child c of board:
            #value = max(value, miniMax(child, depth + 1))
        #return value
        return 5
    else:
        #for each child c of board:
            #value = min(value, miniMax(child, depth + 1))
        #return value
        return 5


board = Board()
childrenBoards = [board]
count = 0

while count <= depthBound:
    for index in count:
        childrenBoards = childrenBoard

    count = count + 1
    childrenBoards = childrenBoards


def executeChild(executeBoard, symbol):
    for place in executeBoard.get_free_places():
        executeBoard.mark_place(place, symbol)


print("Root board")
print(board)


print("Children of root board")
for child in board.children:
    print(child)

print("First child of root board")
print(board.children[0])


print("Children of first child of root board")
for child in board.children[0].children:
    print(child)
