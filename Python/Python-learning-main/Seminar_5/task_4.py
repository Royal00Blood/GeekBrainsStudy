#Саша и Галя коллекционируют монетки.
# Каждый из них решил записать номиналы монеток из своей коллекции.
# Получилось два списка. Эти списки поступают на вход программы
# в виде двух строк из целых чисел, записанных через пробел.
# Необходимо выделить значения, присутствующие в обоих списках и
# оставить среди них только четные. Результат вывести на экран в виде
# строки полученных чисел в порядке их возрастания через пробел.

#При реализации программы используйте функцию filter и кое-что
# еще (для упрощения программы), подумайте что.

s1 = '1 2 5 10 20 50'
s2 = '5 10 50'

l = list(filter(lambda x: x % 2 == 0, map(int, list(i for i in s1.split() if i in s2.split()))))

print(*(sorted(l)))
