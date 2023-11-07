# Задана натуральная степень k.
# Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена
# и записать в файл многочлен степени k.
#Пример - k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
import random
list_out = []
k = int(input("Enter K:"))
def list_print(list_solve):
    text_end = ''
    for i in range(len(list_solve)):
            if i+1 != len(list_solve):
                text_end += list_solve[i]
                symbols = ["+", "-"]
                if i+2 != len(list_solve):
                    text_end += random.choice(symbols)
            else:
                text_end += "="
                text_end += list_solve[i]
    list_out.append(text_end)
def solve_task(el):
    index_list = []
    for i in range(el+1):
        index = random.randrange(1, 101)  # ax^2+bx+c
        index_list.append(index)
    list_sol = []
    for i in range(len(index_list)):
        if el-i != 0:
            text = str(f'{index_list[i]}x^{el-i}')
        else:
            text = str(index_list[i])
        list_sol.append(text)
    list_sol.append("0")
    list_print(list_sol)
    print(list_sol)
    for j in range(0, len(list_sol)-2):
        del list_sol[1]
        list_print(list_sol)
solve_task(k)
print(list_out)
my_file = open("BabyFile.txt", "w+")
for i in list_out:
    my_file.write(i)
    my_file.write('  ')
my_file.close()