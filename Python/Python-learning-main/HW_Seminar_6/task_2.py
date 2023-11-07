# # Напишите программу, которая найдёт произведение пар чисел списка.
# # Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# #
# # Пример:
# # - [2, 3, 4, 5, 6] => [12, 15, 16];
# # - [2, 3, 5, 6] => [12, 15]
#
list_1 = [int(el) for el in input().split()]
new_list = list(map(sum, zip(list_1, list_1[::-1])))
count = lambda list_: int(len(list_)/2) if int(len(list_)) % 2 == 0 else int(len(list_)/2)+1
print(new_list[0:count(new_list)])

