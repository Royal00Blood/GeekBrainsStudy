# Напишите программу для. проверки истинности утверждения:
# ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.

x = int(input("Enter first number for X --> "))
y = int(input("Enter first number for Y --> "))
z = int(input("Enter first number for Z --> "))

def truth_test(a,b,c):
    if (not(a and b and c)) == (not(a) or not(b) or not(c)):
        return True
    else:
        return False

print(truth_test(x,y,z))