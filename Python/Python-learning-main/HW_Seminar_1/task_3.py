# Напишите программу, которая принимает на вход координаты точки (X и Y),
# причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, в которой находится
# эта точка (или на какой оси она находится).

x = int(input("Enter x-coordinate --> "))
y = int(input("Enter y-coordinate --> "))

def input_validation(a, b):
    if a != 0 and b != 0:
        return True
    else:
        return False
# DoQC - determination_of_quarter_coordinates
def DoQC(a, b):
    if a > 0 and b > 0:
        return 1
    elif a > 0 and b < 0:
        return 4
    elif a < 0 and b > 0:
        return 2
    else:
        return 3

if input_validation(x, y):
    print("Coordinate quarter number ->", DoQC(x, y))
else:
    print("Error: x and y must not be zero")

