# Напишите
# программу, которая на
# вход принимает 5
# чисел и находит максимальное
# из них.
#
# Примеры:
#
# - 1, 4, 8, 7, 5 -> 8
# - 78, 55, 36, 90, 2 -> 90
numbers_list = []
for i in range(5):
    print('введите число №', i, '= ')
    numbers_list.append(int(input()))
print(max(numbers_list))
max = 0

for i in range(len(numbers_list)):
    if max < numbers_list[i]:
        max = numbers_list[i]

print("max numbers = ", max)