# # Задайте натуральное число N.
# # Напишите программу, которая составит список простых множителей числа N.
def IsPrime(n):
    d = 2
    while d * d <= n and n % d != 0:
        d += 1
    if d * d > n:
        return n
    else:
        return 0

number = int(input("Enter number :"))
dividers = list(set(list((map(IsPrime, [x for x in range(number)])))))
print(dividers)
print(list(filter(lambda x: number % x == 0 ,list(filter(lambda x:  x != 0, dividers)))))
# def solve_task(n):
#     ans = []
#     d = 2
#     while d * d <= n:
#         if n % d == 0:
#             ans.append(d)
#             n //= d
#         else:
#             d += 1
#     if n > 1:
#         ans.append(n)
#     return ans
# print(solve_task(number))