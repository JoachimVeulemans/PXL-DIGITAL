import random

board_width = 10
board_height = 10
# board = [['.'] * board_width] * board_height
# Dit gaat niet omdat er dan een referenties tussen de arrays liggen
# als je element 0 in array 0 aanpast zal element 0 overal aangepast worden
better_board = [['.' for x in range(board_width)] for y in range(board_height)]


def draw_board():
    for line in range(board_height):
        for place in range(board_width):
            print(better_board[line][place], end='')
        print()


def computer_make_move():
    random_number = random.randint(0, board_width)
    #place_move(random_number)


def place_move(column):
    free_row = find_free_spot_on_column(column)
    if (computer_turn):
        better_board[free_row][int(column)] = '#'
    else:
        better_board[free_row][int(column)] = '@'


def find_free_spot_on_column(column):
    return 1

draw_board()
game_won = False
computer_turn = False

print('Welkom bij 4 op 1 rij!')
print('Jij mag beginnen! Typ de kolomnummer in waar je je zet wil plaatsen')

while (not game_won):
    if (computer_turn):
        computer_make_move()
        print('De computer heeft een zet gedaan, het is jouw beurt!')
        draw_board()
    else:
        print('Typ de kolomnummer in waar je je zet wil plaatsen')
        move = int(input()) - 1
        place_move(move)
    computer_turn = not computer_turn

