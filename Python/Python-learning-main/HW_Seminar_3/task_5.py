# Задайте число. Составьте список чисел Фибоначчи,
# в том числе для отрицательных индексов.
#
# Пример:
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
# - для k = 8 список будет выглядеть так:
# [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]
def fibonacci(n):
    fib1 = fib2 = 1
    n = n - 2
    while n > 0:
        fib1, fib2 = fib2, fib1 + fib2
    n -= 1
    return n
def fibonacci_complit_list(N):
    new_list = []
    for i in range(2*N+1):
        if i <= N:
            new_list.append(fibonacci(N-i)*(-1)**(N-i))
        elif i == N+1:
            new_list.append(0)
        else:
            new_list.append(fibonacci(i))
    return new_list
number = int(input('«Номер элемента ряда Фибоначчи:'))
print(fibonacci_complit_list(number))