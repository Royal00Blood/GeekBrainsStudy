# Напишите программу, которая принимает на вход координаты двух точек и
# находит расстояние между ними в 2D пространстве.
print("Point number 1:")
x_1 = int(input("Enter x-coordinate --> "))
y_1 = int(input("Enter y-coordinate --> "))
print("Point number 2")
x_2 = int(input("Enter x-coordinate --> "))
y_2 = int(input("Enter y-coordinate --> "))


# DBP - distance_between_points
def DBP(x1, y1, x2, y2):
    return ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** (1 / 2)


print("distance_between_points = ","%.2f" % (DBP(x_1, y_1, x_2, y_2)))
