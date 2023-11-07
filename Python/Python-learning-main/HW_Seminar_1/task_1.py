# Напишите программу, которая принимает на вход цифру,
# обозначающую день недели, и проверяет,
# является ли этот день выходным.
number_day = int(input('Enter number day of week --> '))

def check_of_the_day(day):
    if day > 0 and day < 8:
        if day >= 6:
            return True
        else:
            return False
    else:
        return -1
if check_of_the_day(number_day) == True:
    print("It's a holiday")
elif check_of_the_day(number_day) == False:
    print("It's not a holiday")
else:
    print("Number is not a day of the week")