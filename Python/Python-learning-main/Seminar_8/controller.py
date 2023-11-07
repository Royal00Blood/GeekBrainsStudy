import viev as v
import csv
import json
def find_worker(data):

    return

# Сделать выборку сотрудников по должности
def filter_position(data):
    return 0
# Сделать выборку сотрудников по зарплате
def filter_salary(data):
    return 0
#Добавить сотрудника
def add_worker(data):
    with open('members.csv','w') as data:
        worker =f"{name}, {surname}, {position}, {salary}"
        data.write(worker)
    return 0
# Удалить сотрудника
def del_data_worker(data):
    return 0
# Обновить данные сотрудника
def refactor_data_workers(dict_data_new):
    return 0

# Экспортировать данные в формате json
def export_json(dict_data):
    filename = 'data.json'
    #dict_data = {'name': 33,'surname': 33,'position': 'engineer', 'salary': 10000}
    with open(filename, "w") as file:
        json.dump(dict_data, file)

# Экспортировать данные в формате csv
def export_csv(dict_data):
    with open('data.csv', 'w') as csvfile:
        fieldnames = ['name', 'surname', 'position', 'salary']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerow(dict_data)


# Закончить работу
def end_program(data):
    return 0
def start():
    options = [find_worker]
    return v.show_menu()

