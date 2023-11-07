package Homework.HomeWork_3.game;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Выбор игры:");
        System.out.println("   > 1-цифры.    ");
        System.out.println("   > 2-буквы EN. ");
        System.out.println("   > 3-буквы RU. ");

        Scanner in = new Scanner(System.in);

        int num = 0;
        Game game = null;
        while (num <= 0 || num>3) {
            System.out.print("Выберите игру, введя соответствующую цифру: ");
            num = in.nextInt();

            switch (num) {
                case 1:
                    game = new NumberGame();
                    System.out.print("Отлично вы выбрали игру с цифрами: ");
                    break;
                case 2:
                    game = new WordGame();
                    System.out.print("Отлично вы выбрали игру с английскими буквами: ");
                    break;
                case 3:
                    game = new WordRussianGame();
                    System.out.print("Отлично вы выбрали игру с русскими буквами: ");
                    break;
                default:
                    System.out.println("Простите, но вы допустили ошибку. Такой игры нет. Попробуйте еще раз <^_^>");
            }
        }
        int moveNumMax = 10;
        game.start(4,moveNumMax);
        int moveNum = 0;
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println(String.format("Ваш ход № %d из %d.",moveNum,moveNumMax));
            moveNum ++;
            String answer = in.next();
            Answer answerGame = game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков.", answerGame.getCows(), answerGame.getBulls()));
        }
        System.out.println(game.getGameStatus());
        String yn = "";

        while (!(yn.equals("yes") || yn.equals("no"))){
            System.out.println("Если вы хотите увидеть историю введите yes:");
            yn = in.next();

            switch (yn){
                case "yes":
                            ArrayList<Answer> his = game.getHistory();
                            for (int i = 0; i < his.size(); i++) {
                                System.out.println(String.format("Ход № %d: Пользователь ввел: %s Совпало элементов: %d  Совпало элементов по позиции: %d", i, his.get(i).getUserInput(), his.get(i).getCows(), his.get(i).getBulls()));
                            }
                break;
                case "no":
                    System.out.println(" <^_^>");
                break;
                default:
                    System.out.println("Вы ввели не то");
                break;
            }
        }
    }
}
