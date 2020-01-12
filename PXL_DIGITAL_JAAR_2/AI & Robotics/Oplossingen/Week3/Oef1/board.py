from copy import deepcopy
from src.CourseMaterials.Week3.Oef1.place import Place

class Board:
    starting_board = [[Place(x, y) for x in range(3)] for y in range(3)]

    def __init__(self, inner_board=starting_board, value="", children=[], parent_board=deepcopy(starting_board)):
        self.inner_board = deepcopy(inner_board)
        self.value = value
        self.children = deepcopy(children)
        self.parent_board = parent_board

    def get_free_places(self):
        free_spaces = []
        for i in range(len(self.inner_board)):
            for j in range(len(self.inner_board[i])):
                if self.inner_board[i][j].value is "~":
                    free_spaces.append(self.inner_board[i][j])
        return free_spaces

    def mark_place(self, place, symbol):
        self.children.append(Board(self.inner_board))
        self.children[len(self.children) - 1].inner_board[place.row][place.column].value = symbol

    def __str__(self):
        output = ""

        for places in self.inner_board:
            for place in places:
                output += str(place.value) + " "
            output += "\n"

        return output

    def __repr__(self):
        return repr(self.__str__())
