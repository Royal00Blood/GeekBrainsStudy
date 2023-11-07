#Даны два файла, в каждом из которых находится запись многочлена.
# Задача - сформировать файл, содержащий сумму многочленов.

f1 = open("text1.txt")
f2 = open("text2.txt")
text1 = f1.read()
text2 = f2.read()
f1.close()
f2.close()

list_numbers_1 = []
list_numbers_2 = []

with open('polynimial_1.txt', 'w') as f:
    f.write('-5*x^3 + 8*x^2 + 111')

with open('polynimial_2.txt', 'w') as f:
    f.write('27*x^2 + 8*x - 2')


with open('polynimial_1.txt', 'r') as f:
    t1 = f.readlines()

with open('polynimial_2.txt', 'r') as f:
    t2 = f.readlines()

t = t1 + t2


with open('polynomial_res.txt', 'w') as f:
    for i in range(len(t)):
        if (i < len(t)-1):
            f.write(f'{(t)[i]} + ')
        else:
            f.write(f'{(t)[i]}')
