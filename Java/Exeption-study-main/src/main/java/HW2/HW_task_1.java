package HW2;

import java.io.*;
import java.util.Scanner;

public class HW_task_1 {
    public static void main(String[] args) {
            float inputFloatNumber = inputFloat();
            System.out.println(inputFloatNumber);
    }
    public static float inputFloat () {
        Scanner console = new Scanner(System.in);
        System.out.print("ВВедите число: ");
        while (!console.hasNextFloat()) {
            console.nextLine();
            System.out.println("Попробуйте еще:");
        }
        return console.nextFloat();
    }
}
