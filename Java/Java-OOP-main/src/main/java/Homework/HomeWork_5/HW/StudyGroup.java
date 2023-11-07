package Homework.HomeWork_5.HW;

import java.util.*;
//Open-closed principle - скрытие подробностей от других программистов и защита с помошью контракта интерфейса
public class StudyGroup implements GroupService {
    int groupID;

    public StudyGroup(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public List<Integer> CreateGroup(Teacher teacher, List<Student> students) {
        List<Integer> listGroup= new ArrayList<Integer>();
        listGroup.add(teacher.ID);
        for (User man:students) {
            listGroup.add(man.ID);
        }
        return listGroup;
    }
}
