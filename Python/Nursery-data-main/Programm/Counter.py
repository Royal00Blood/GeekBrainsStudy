class Couner:
    def __init__(self):
        self.__count_animal = 0
        
    def increment_count(self):
        self.__count_animal += 1
    
    def show_counter(self):
        print(self.__count_animal)