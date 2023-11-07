package Homework.HomeWork_5.HW;

import java.util.List;
// Interface segregation principle - не отвечает за лишние функции
public interface GroupService {
    List<Integer> CreateGroup(Teacher teacher, List<Student> students);

}
