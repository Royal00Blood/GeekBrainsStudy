# Задайте список из N элементов, заполненных числами из промежутка [-N, N].
# Найдите произведение элементов на указанных позициях.
# Позиции хранятся в отдельном списке( пример n=4, lst1=[4,-2,1,3] - списко на основе n, а позиции элементов lst2=[3,1].
import random
list_position = [2, -2]
number = int(input('Введите число '))
def create_list_rund(num):
    list_number = []
    N = random.randrange(4, 10)
    for i in range(N):
        list_number.append(random.randrange(-num, num))
    print("list_number ",list_number)
    return list_number

def sum_numbers_el(list_number_get,list_pos):
    sum = 0
    for i in range(len(list_pos)):
        sum += list_number_get[list_pos[i]]
    return sum
list_help = create_list_rund(number)
print(sum_numbers_el(list_help,list_position))
# Реализуйте алгоритм перемешивания списка.
# (рандомно поменять местами элементы списка между собой)
def fresh_list(list_num):
    data = []
    for k in range(100):
        for i in range(len(list_num)):
            index = random.randrange(0, len(list_num))
            help = list_num[i]
            list_num[i] = list_num[index]
            list_num[index] = help
    return list_num
print('fresh list ',fresh_list(list_help))