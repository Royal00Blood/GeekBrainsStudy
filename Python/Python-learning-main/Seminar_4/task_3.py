# Вводится слово. Переменной msg присвоить строку "палиндром",
# если введенное слово является палиндромом (одинаково читается и вперед и назад),
# а иначе присвоить строку "не палиндром". Проверку проводить без учета регистра.
# Программу реализовать с помощью тернарного условного оператора.
# Значение переменной msg отобразить на экране.
# Sample Input:
# Казак
# Sample Output:
# палиндром
word = input("Enter word ")

def Chek_palindrom(word_test):
    if str(word.upper()) == str(word.upper())[::-1]:
        print(f"{word} is Palindrome")
    else:
        print(word_test)

Chek_palindrom(word)