package Homework.HomeWork_4.example.task04;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employeeArrayList.add(new Employee("FIO - " + i, new Random().nextDouble(), "java"));
        }

        LRUCache<Employee> lru = new LRUCache<>(5);
        for (Employee e: employeeArrayList ) {
//            System.out.println(e);
            lru.addElement(e);
        }

        for (Employee e: lru.getAllElement()) {
            System.out.println(e);
        }

        System.out.println();
        lru.addElement(new Employee("FIO - " + 10, new Random().nextDouble(), "java"));
        for (Employee e: lru.getAllElement()) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println(lru.getElement(3));

    }
}
