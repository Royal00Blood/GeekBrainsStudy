# Напишите программу, удаляющую из текста все слова, содержащие ""абв"".
# a'lsng фбв абв ааа абв ввв абв
string = list(input("Введите строку: ").split(" "))
for i, word_in in enumerate(string):
    flag = (lambda word: "абв" in word)
    if (flag(word_in)):
        string.pop(i)
print(*string)

