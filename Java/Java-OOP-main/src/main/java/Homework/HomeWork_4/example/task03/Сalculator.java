package Homework.HomeWork_4.example.task03;

import java.util.ArrayList;
import java.util.List;

public class Сalculator {
    public Double sum (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum += i.doubleValue();
        return sum;
    }
    public Double mul (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum *= i.doubleValue();
        return sum;
    }
    public Double div (List<? extends Number> items){
        double sum = 0;
        for (Number i: items)
            sum /= i.doubleValue();
        return sum;
    }
    public ArrayList binary (List<? extends Number> items){
        ArrayList <String> array = new ArrayList<>();
        for (Number i:items) {
            array.add(Integer.toBinaryString(i.intValue()));
        }
        return array;
    }

}
