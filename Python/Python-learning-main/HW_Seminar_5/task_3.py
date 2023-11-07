# Создайте программу для игры в ""Крестики-нолики"".

list_game = [["*" for x in range(3)] for j in range(3)]
for i in list_game:
    print(*i)
def instruction():
    list_g = [["*" for x in range(3)] for j in range(3)]
    print("Инструкция: Номер позиции звездочки, которую хотите заменить на свой символ задается номером столбца и строки.")
    print("Например, элемент 1 2 будет соответствовать позиции N:")
    list_g[0][1] = "N"
    for i in list_g:
        print(*i)

def step_player(list_g, symbol):
    while True:
        ansver = list(map(int, input("Введите номер строки и столбца: ").split()))
        if (ansver[0] >0 and  ansver[0] <=3) and (ansver[1] >0 and  ansver[1] <=3):
            if list_g[ansver[0]-1][ansver[1]-1] !="O" or list_g[ansver[0]-1][ansver[1]-1] != "X":
                list_g[ansver[0]-1][ansver[1]-1] = symbol
                return list_g
            else:
                print("Вы выбрали элемент игрового поля, который уже занят.")
        else:
            print("Вы ввели неверные числа! необходимо ввести числа в интервале от 1 до 3.")
def win_check(list_g, plauer,symbol):

    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, list_g[0]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, list_g[1]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, list_g[2]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False

    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, [list_g[x][0] for x in range(3)]))))) == 0:
        print(f"{plauer} выиграл!!!")
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, [list_g[x][0] for x in range(3)]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, [list_g[x][0] for x in range(3)]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, [list_g[x][x] for x in range(3)]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    if len(list(filter(lambda x: False is x, list(map(lambda x: x == symbol, [list_g[x][2-x] for x in range(3)]))))) == 0:
        print(f"{plauer} выиграл!!!")
        for i in list_g:
            print(*i)
        return False
    return True
instruction()
flag = True
user_1 = input('Введите имя игрока, играющего крестиками: ')
user_2 = input('Введите имя игрока, играющего ноликами: ')
dict_users = {"X": user_1, "O": user_2}
while flag:
    list_game = step_player(list_game, "X")
    for i in list_game:
        print(*i)
    flag = win_check(list_game, dict_users["X"],"X")
    if flag:
        list_game = step_player(list_game, "O")
        for i in list_game:
            print(*i)
        flag = win_check(list_game, dict_users["O"], "O")
