#Дан список, вывести отдельно буквы и цифры.

a = ("a", 'b', '2', '3','c')
# b = ( 'a' , 'b' , 'c')
# c = ( '2', '3')
#numbers = input().split()
numbers = list(a)

c = list(filter(lambda s: not all('a'<=x<='z' or 'а'<=x<='я' for x in s.lower())|False, numbers))
b = list(filter(lambda x: not(x in c), numbers))
print("b = ", *b)
print("c = ", *c)


# a = ( "a", 'b', '2', '3' ,'c')
# b = ( 'a' , 'b' , 'c')
# c = ( '1', '2', '3')
#
# x = a+b+c
# print(x)
#
# number_list = []
# char_list = []
#
#
# for i in x:                # обработка исключений
#     try:
#         int(i)
#         number_list.append(i)
#     except:
#         char_list.append(i)
#
# print(number_list)
# print(char_list)
