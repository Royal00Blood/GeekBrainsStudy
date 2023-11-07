# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.

a = [1, 2, 3]
b = ["a","b","c"]
def ziper(x, y):
    zim_list = list(zip(x, y))
    return zim_list
def unzip(z):
    id, list = zip(*z)
    return id, list

x = ziper(a,b)
print(list(x))
f, s = unzip(x)
print(f, s )


