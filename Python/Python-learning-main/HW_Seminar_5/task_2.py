# Создайте программу для игры с конфетами человек против человека.
#
# Условие задачи: На столе лежит 2021 конфета.
# Играют два игрока делая ход друг после друга.
# Первый ход определяется жеребьёвкой.
# За один ход можно забрать не более чем 28 конфет.
# Все конфеты оппонента достаются сделавшему последний ход.
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
#
# a) Добавьте игру против бота
#
# b) Подумайте как наделить бота ""интеллектом""
import random

players_count = int(input("Введите 1-если хотите играть с ботом, 2-если с другом и 100-если с умным ботом: "))
count_sweets_defolt = 2021

def step(name_player, count_sweets_step):
    step_flag, number = True, 0
    while step_flag:
        print(f"{name_player} ваш ход. ")
        number = int(input(f"Сейчас осталось {count_sweets_step} конфет. Введите количество конфет от 1 до 28: "))
        if (number > 0) and (number <= 28):
            step_flag = False
            count_sweets_step -= number
        else:
            print('Вы ввели не верное число-количество конфет!!! ')
    return number, count_sweets_step
def step_computer(count_sweets_step):
    number = random.randint(1, 28)
    count_sweets_step -= number
    return number, count_sweets_step
def step_computer_brain(count_sweets_step):
    if count_sweets_step <= 57 and count_sweets_step >= 30:
        number = count_sweets_step - 29
    else:
        number = random.randint(1, 28)
    count_sweets_step -= number
    return number, count_sweets_step
def check_sweets(name_player_now, name_player_next, count_sweets_now):
    if count_sweets_now == 0:
        print(f" {name_player_now} победил!")
    elif count_sweets_now < 29:
        print(f" {name_player_next} победил!")
        count_sweets_now = 0
    return count_sweets_now

def game_players(name1, name2, count_sweets):
    list_players = [name1, name2]
    list_count_sweets = [0, 0]
    dict_game = {list_players[0]: list_count_sweets[0], list_players[1]: list_count_sweets[1]}
    while count_sweets != 0:
        numbers_sweets, count_sweets = step(name1, count_sweets)
        dict_game[name1] += numbers_sweets
        count_sweets = check_sweets(name1, name2, count_sweets)
        if(count_sweets!=0):
            numbers_sweets, count_sweets = step(name2, count_sweets)
            dict_game[name2] += numbers_sweets
            count_sweets = check_sweets(name2, name1, count_sweets)
def game_player(name1, name2, count_sweets):
    list_players = [name1, name2]
    list_count_sweets = [0, 0]
    dict_game = {list_players[0]: list_count_sweets[0], list_players[1]: list_count_sweets[1]}
    while count_sweets != 0:
        numbers_sweets, count_sweets = step(name1, count_sweets)
        dict_game[name1] += numbers_sweets
        count_sweets = check_sweets(name1, name2, count_sweets)
        if(count_sweets!=0):
            numbers_sweets, count_sweets = step_computer(count_sweets)
            dict_game[name2] += numbers_sweets
            count_sweets = check_sweets(name2, name1, count_sweets)

def game_player_vs_computer_brain(name1, name2, count_sweets):
    list_players = [name1, name2]
    list_count_sweets = [0, 0]
    dict_game = {list_players[0]: list_count_sweets[0], list_players[1]: list_count_sweets[1]}
    while count_sweets != 0:
        numbers_sweets, count_sweets = step(name1, count_sweets)
        dict_game[name1] += numbers_sweets
        count_sweets = check_sweets(name1, name2, count_sweets)
        if(count_sweets!=0):
            numbers_sweets, count_sweets = step_computer_brain(count_sweets)
            dict_game[name2] += numbers_sweets
            count_sweets = check_sweets(name2, name1, count_sweets)

count_sweets = 0
name_1 = input("Введите свое имя: ")
print(f"Добрый день {name_1}!!")
if players_count == 2:
    name_2 = input("Введите имя друга: ")
    print(f"Добрый день {name_2}!!")
    print(f" В игре учавствуют двое сладкоежек {name_1} и {name_2}. Да победит лучший обжора!!")
    while count_sweets < 30:
        count_sweets = int(input("Введите количество конфет не менее 35, если не хотите поставьте 0:  "))
        if count_sweets < 35 and count_sweets != 0:
            print("Вы ввели менее 35 конфет, ваше количество будет увеличено до минимально допустимого")
            count_sweets += 35
        elif count_sweets == 0:
            count_sweets = count_sweets_defolt
    game_players(name_1, name_2, count_sweets)
elif players_count == 1:
    name_2 = "computer"
    print(f" В игре учавствуют двое сладкоежек {name_1} и {name_2}. Да победит лучший обжора!!")
    while count_sweets < 30:
        count_sweets = int(input("Введите количество конфет не менее 35, если не хотите поставьте 0:  "))
        if count_sweets < 35 and count_sweets != 0:
            print("Вы ввели менее 35 конфет, ваше количество будет увеличено до минимально допустимого")
            count_sweets += 35
        elif count_sweets == 0:
            count_sweets = count_sweets_defolt
    game_player(name_1, name_2, count_sweets)
elif players_count == 100:
    name_2 = "computer"
    print(f" В игре учавствуют двое сладкоежек {name_1} и {name_2}. Да победит лучший обжора!!")
    while count_sweets < 30:
        count_sweets = int(input("Введите количество конфет не менее 35, если не хотите поставьте 0:  "))
        if count_sweets < 35 and count_sweets != 0:
            print("Вы ввели менее 35 конфет, ваше количество будет увеличено до минимально допустимого")
            count_sweets += 35
        elif count_sweets == 0:
            count_sweets = count_sweets_defolt
    game_player_vs_computer_brain(name_1, name_2, count_sweets)
else:
    print("Вы неверно прочитали правила!!!")