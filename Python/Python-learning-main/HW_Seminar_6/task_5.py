# # Задайте последовательность чисел.
# # Напишите программу, которая
# # выведет список неповторяющихся элементов исходной последовательности.
numbers_list = [int(el) for el in input('Enter numbers: ').split()]
elements = list(set(numbers_list))
print(elements)
