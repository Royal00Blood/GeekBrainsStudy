package Homework.HomeWork_3.game;

import java.util.ArrayList;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
    ArrayList<Answer> getHistory();
}
