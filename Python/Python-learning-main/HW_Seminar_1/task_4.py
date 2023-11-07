# Напишите программу, которая по заданному номеру четверти,
# показывает диапазон возможных координат точек в этой четверти (x и y)

quarter_number = int(input("Enter coordinate quarter number--> "))

def range_definition(number):
    switcher = {
        1: "x and y: [0 :infinity] ",
        2: "x: [-infinity : 0 ] ; y: [0 :  infinity]",
        3: "x: [-infinity : 0 ] ; y: [-infinity : 0]",
        4: "x: [0 :   infinity] ; y: [-infinity : 0]"
    }
    return switcher.get(number, "Invalid month")
print(range_definition(quarter_number))