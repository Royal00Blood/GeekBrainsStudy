package Homework.HomeWork_5.HW;

//Open-closed principle - скрытие подробностей от других программистов и защита с помошью контракта интерфейса
public class View implements ViewIService {
    @Override
    public String studentView(Student student) {
        return student.toString();
    }
}
