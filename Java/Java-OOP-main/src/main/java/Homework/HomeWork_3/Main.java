package Homework.HomeWork_3;

import Homework.HomeWork_3.human.Bicycle;
import Homework.HomeWork_3.human.Human;
import Homework.HomeWork_3.human.Roliki;
import Homework.HomeWork_3.human.Transport;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        Roliki roliki=new Roliki();
        human.drive(roliki);
        Transport transport = new Bicycle();
    }
}