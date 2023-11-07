# Вычислить число c заданной точностью d
# Пример:
#
# - при $d = 0.001, π = 3.141.$    $10^{-1} ≤ d ≤10^{-10}$
def solve_task(num1, num2):
    solve = num1 / num2
    return solve
def toFixed(numObj, digits=0):
    return f"{numObj:.{digits}f}"
def Print_solve(num):
    for i in range(1, 10):
        print(f'print {i} element after point :{toFixed(num, i)}')

number_1 = float(input('Enter first number: '))
number_2 = float(input('Enter second number: '))
solve_number = solve_task(number_1, number_2)
Print_solve(solve_number)