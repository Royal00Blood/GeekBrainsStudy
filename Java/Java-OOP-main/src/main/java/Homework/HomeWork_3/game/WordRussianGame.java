package Homework.HomeWork_3.game;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (char i = 'а'; i < 'я'; i++) {
            charList.add(String.valueOf(i));
        }
        System.out.println(charList);
        return charList;
    }
}
