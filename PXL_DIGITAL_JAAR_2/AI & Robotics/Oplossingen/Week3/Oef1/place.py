class Place:
    def __init__(self, row, column, value="~"):
        self.row = row
        self.column = column
        self.value = value

    def __str__(self):
        return str(self.row) + "," + str(self.column)

    def __repr__(self):
        return repr(self.__str__())
