# Пользовательский интерфейс

def interface():
    print("\n")
    print("(Instruction) Enter the number corresponding to the action:  ")
    print("1 - Show phone book on screen ")
    print("2 - Add new entry ")
    print("3 - Write data to csv format ")
    print("4 - Write data to json format ")
    print("5 - Close program \n")
    return int(input("Enter the number: "))