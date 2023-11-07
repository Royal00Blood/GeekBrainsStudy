package Homework.HomeWork_5.HW;

import java.util.List;

//Single responsibility principle - отвечает только за студента
public  class Student extends User {
    int groupID;
    List<Integer> group;

    @Override
    public String toString() {
        return super.toString();
    }
////Dependency inversion principle
    //Open-closed principle
    public String CustomString(ViewIService viewMan){
        return viewMan.studentView(this);
    }
}
