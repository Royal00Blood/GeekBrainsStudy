# Напишите программу, которая принимает на вход вещественное число
# и показывает сумму его цифр.
#
# Пример:
#
# - 6782 -> 23
# - 0,56 -> 11
N = float(input("Ввведите число: "))
def Sum_in_numbers(num, sum=0):
    while num % 1 > 0:
        num *= 10
    num_1 = int(num)
    while (num_1 / 10 > 0 and num_1 > 0):
        sum += int(num_1 % 10)
        num_1 = num_1 / 10
    return sum
print(f'Сумма чисел числа = {Sum_in_numbers(N)}')