# Задайте последовательность чисел.
# Напишите программу, которая
# выведет список неповторяющихся элементов исходной последовательности.
numbers_list = [int(el) for el in input('Enter numbers: ').split()]
elements = []
def Print_universal_element(nums):
    elements = []
    for i in range(len(nums)):
        if not(nums[i] in elements):
            elements.append(nums[i])
    print(elements)

Print_universal_element(numbers_list)