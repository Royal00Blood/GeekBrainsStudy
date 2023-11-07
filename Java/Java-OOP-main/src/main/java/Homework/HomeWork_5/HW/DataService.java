package Homework.HomeWork_5.HW;

import java.util.List;
// Interface segregation principle - не отвечает за лишние функции
public interface DataService {
    User create(Student student);
    User create(Teacher teacher);
    List<User> read(List<User> users);


}
