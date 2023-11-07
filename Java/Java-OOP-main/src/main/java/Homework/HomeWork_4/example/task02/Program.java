package Homework.HomeWork_4.example.task02;

import javax.swing.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        BoxWithNumber<Integer> bwn1 = new BoxWithNumber<>(1,2,3,4,5);
        BoxWithNumber<Integer> bwn2 = new BoxWithNumber<>(2,4,6,8,10);
        BoxWithNumber<Double> bwn3 = new BoxWithNumber<>(2.0,4.0,6.0,8.0,10.0);

//        BoxWithNumber<String> str = new BoxWithNumber<String>();
        System.out.println(bwn1.average());
        System.out.println(bwn2.average());

        System.out.println(bwn1.compareAverage(bwn2));
        System.out.println(bwn2.compareAverage(bwn3));
    }
}
