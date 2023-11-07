# # Задайте список из нескольких чисел.
# # Напишите программу, которая найдёт сумму элементов списка,
# # стоящих на нечётной позиции.
# # Пример:
# # - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

number = list(map(int, input().split()))
index_filter = list(filter(lambda x: (x % 2) != 0 and x != 0, [x for x in range(len(number))]))
print(index_filter)
def print_(list_,index):
    list_ans = []
    for i in range(len(index)):
        list_ans.append(list_[index[i]])
    return list_ans
list_ans = print_(number,index_filter)

print(sum(list_ans))