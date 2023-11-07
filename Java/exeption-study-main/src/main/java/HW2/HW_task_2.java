package HW2;
import java.util.Scanner;
public class HW_task_2 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 1, 8, 9};
        int d = 1;
        if (intArray.length - 1 < 8) {
            System.out.println("размерность массива не та надо бы меньше");
        } else if (d == 0) {
            System.out.println("на ноль не делят");
        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }

    }
}
