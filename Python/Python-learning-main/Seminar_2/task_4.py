# Напишите программу, которая принимает
# на входчисло N и выдаёт последовательность
# из N членов.
# *Пример: *
# - Для
# N = 5: 1, -3, 9, -27, 81
import random
N = int(input('Enter number'))
def goal(num):
    list_number = []
    for i in range(num):
        list_number.append((-3) ** i)
    print(list_number)
goal(N)
