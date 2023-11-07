# расчитать нод двух чисел(быстрый и медленный способ)
a = 20
b = 58

if a < b:
    a, b = b, a

while b != 0:
    a, b = b, a % b

print(a)
#_
a = 20
b = 75

while a != b:
    if a > b:
        a -= b
    else:
        b -= a

print(a)
