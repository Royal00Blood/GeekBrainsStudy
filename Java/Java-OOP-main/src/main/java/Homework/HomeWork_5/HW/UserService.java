package Homework.HomeWork_5.HW;

import java.util.List;
//Open-closed principle - скрытие подробностей от других программистов и защита с помошью контракта интерфейса
public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return new Student();
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher();
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
