# # Задайте список из вещественных чисел.
# # Напишите программу, которая найдёт разницу между максимальным и минимальным
# # значением дробной части элементов.(если получаются длинные числа после запятой,
# # это нормально и особенность данного языка программирования. ваш ответ может
# # не совпадать с примером(может получитя 0,20))
# #
# # Пример: [1.1, 1.2, 3.1, 5, 10.01] => 0.19

list_next = list(map(lambda n: n % 1, [float(el) for el in input().split()]))
print('%.2f' % (max(list_next)-min(list_next)))
