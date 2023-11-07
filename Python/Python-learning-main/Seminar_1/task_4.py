# Напишите
# программу, которая будет принимать на вход
# дробь и показывать первую цифру дробной части числа.
# *Примеры: *
# - 6, 78 -> 7
# - 5 -> нет
# - 0, 34 -> 3



def Find_numers(in_number):
    a = int(in_number * 10 % 10)
    return a

number = float(input('Введите число number = '))
a = Find_numers(number)
if a > 0:
    print(a)
else:
    print("no numbers")