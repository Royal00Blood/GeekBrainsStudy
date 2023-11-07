# Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
#
# Пример:
#
# - [2, 3, 4, 5, 6] => [12, 15, 16];
# - [2, 3, 5, 6] => [12, 15]

test_list_1 = [2, 3, 4, 5, 6]
test_list_2 = [2, 3, 5, 6]
def task_funktion(list_in):
    new_list = []
    if len(list_in)%2 == 0:
        index_max = len(list_in)//2
    else:
        index_max = len(list_in) // 2 + 1

    for i in range(index_max):
        if i != len(list_in)-1-i:
            new_list.append(list_in[i]*list_in[len(list_in)-i-1])
        else:
            new_list.append(list_in[i]**2)
    return new_list

print(task_funktion(test_list_1))
print(task_funktion(test_list_2))