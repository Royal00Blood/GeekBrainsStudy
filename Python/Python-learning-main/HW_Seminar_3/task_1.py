# Задайте список из нескольких чисел.
# Напишите программу, которая найдёт сумму элементов списка,
# стоящих на нечётной позиции.
# Пример:
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

list_in = input('Введите числа: ').split()
def Sum_elements(list_out,sum = 0 ):
    for i in range(len(list_in)):
        list_in[i] = int(list_in[i])
    for i in range(len(list_in)):
        if i > 0 and i % 2 != 0:
            sum += list_in[i]
    return sum

print('List: ',list_in, 'Sum elements',Sum_elements(list_in))

