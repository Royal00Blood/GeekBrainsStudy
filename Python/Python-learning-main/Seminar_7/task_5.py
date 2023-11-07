# Напишите программу, которая подсчитает и
# выведет сумму квадратов всех двузначных чисел, делящихся на 9.
# При решении задачи используйте комбинацию функций filter, map, sum.
#
# Обратите внимание: на 9 должно делиться исходное двузначное число, а не его квадрат.
numbers = list(map(int, input("Enter numbers").split()))
numbers_new = list(filter(lambda x: x / 10 > 0 and x % 9 == 0, numbers))
print(numbers_new)
number =sum(numbers_new)
print(number)
