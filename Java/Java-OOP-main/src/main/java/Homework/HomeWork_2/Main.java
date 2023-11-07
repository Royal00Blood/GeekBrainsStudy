package  Homework.HomeWork_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Creature cat = new Cat("Smirnov");
        ArrayList<Block> bloks = new ArrayList<>();
        ArrayList<Creature> pers = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            bloks.add(new Wall(i*0.34));
            bloks.add(new Treadmill(i*0.2675656));
        }
        pers.add(new Human("Kolysik"));
        pers.add(new Cat("Vano"));
        pers.add(new Robot("Sansa"));
        for (Creature object:pers) {
            for (Block block:bloks) {
                if(!block.checkOpportunity(object)){
                    break;
                }
            }
        }

    }

}