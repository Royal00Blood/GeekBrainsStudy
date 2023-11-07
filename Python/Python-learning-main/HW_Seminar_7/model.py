import csv
import json
import time

# Блок функционала
# функция получения данных
def get_data_csv(flag=0):
    if flag == 0:
        with open('data.csv') as f:
            data = csv.reader(f)
            for row in data:
                print(row)
        time.sleep(0.5)
    if flag == 1:
        with open('data.csv') as f:
            data = csv.DictReader(f)
            for row in data:
                print(row)
                print(row['hostname'], row['model'])
    if flag == 2:
        with open('data.csv') as f:
            data = csv.reader(f)
            data_list = list(data)
        return data, data_list


# функция добавления новой записи
def new_data():
    name = input("Enter Name: ")
    surname = input("Enter Surname: ")
    town = input("Enter town: ")
    phone_number = input("Enter phone_number: ")
    status = input("Enter status: ")
    return name, surname, town, phone_number, status

def add_data():
    data = list(new_data())
    print(data)
    return data


def export_data_csv(data):
    with open('data.csv', 'a', newline='') as state_file:
        writer = csv.writer(state_file)
        for i in range(len(data)):
            writer.writerow(data[i])




def data_formating(data_list):
    data_dict = {}
    data_dict['people'] = []
    for i in range(len(data_list)):
        data_dict['people'].append({
            'name': data_list[i][0],
            'surname': data_list[i][1],
            'town': data_list[i][2],
            'phone_number': data_list[i][3],
            'status': data_list[i][4]
        })
    return data_dict

def export_data_json(data_list):
    dict_new = data_formating(data_list)
    with open('data.json', 'w') as outfile:
        json.dump(dict_new, outfile)
    return 0

