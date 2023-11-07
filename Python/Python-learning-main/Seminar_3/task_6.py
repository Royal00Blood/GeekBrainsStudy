# Напишите программу,
# которая определит позицию второго вхождения строки в списке либо сообщит,
# что её нет.
# text = Hello world! Goodbye world!
# wor
# 21

full_text = input("введите текст: ")
find_text = input("введите символы(слово/текст) для поиска: ")
index = full_text.find(find_text, (full_text.find(find_text) + 1))
if index != (-1):
    print(index)
else:
    print("error")
