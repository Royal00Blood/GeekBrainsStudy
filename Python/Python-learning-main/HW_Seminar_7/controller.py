import model as m
import view
import sys
data_global = []
def switch(lang):
    if lang == 1:
        m.get_data_csv(0)
        # return view.interface()
    elif lang == 2:
        data = m.add_data()
        data_global.append(data)
        print("Do you want to save the new record? \n")
        print("If yes enter 'y', if no enter 'n' ")
        if input(": ") == "y":
            m.export_data_csv(data_global)
            return data_global
        # return view.interface()
    elif lang == 3:
        m.export_data_csv(data_global)
        m.get_data_csv(0)
        return data_global
        # return view.interface()
    elif lang == 4:
        m.export_data_csv(data_global)
        _, data = m.get_data_csv(2)
        m.export_data_json(data)
        # return view.interface()
    elif lang == 5:
        sys.exit()
    else:
        print("You had mistake!")
        # return view.interface()
def main():
    answer = view.interface()
    switch(answer)
