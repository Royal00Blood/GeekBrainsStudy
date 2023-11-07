# Реализовать навигацию по меню
# > data_animals
# > add_data
import sys
from Counter import Couner
from nursery import Nursery

def main():
    try:
        flag = interface()
        if flag > 0:
            if flag == 1:
                show_data()
            
            if flag == 2:
                add_animals()
            
            if flag > 2:
                sys.exit()    
    except:
        print("Error work programm, Sorry")
        sys.exit() 
    
    
def interface():
    print("\n" + "=" * 20)
    print("Выберите необходимое действие")
    print("1. Show data animals")
    print("2. Add new animals")
    print("9. Закончить работу")
    return int(input("Введите номер необходимого действия: "))

def show_data():
    pass

def add_animals():
    pass