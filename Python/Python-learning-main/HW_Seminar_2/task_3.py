# Задайте список из n чисел последовательности (1+1/n)**n и выведите на экран их сумму.
#
# Пример:
#
# - Для n = 6: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}

N = int(input("Введите число: "))
number = []
def task_solve(num):
    for i in range(num):
        number.append((1 + 1 / i) ** i)
    return number

print(task_solve(N))