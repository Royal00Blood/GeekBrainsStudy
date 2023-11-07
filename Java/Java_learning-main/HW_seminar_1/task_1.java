import java.util.Scanner;
/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter triangular_number: ");
        int number = iScanner.nextInt();
        System.out.println(Triangular_number(number));
    }

    private static double Triangular_number(int n) {
        return 0.5 * n * (n + 1);
    }
}