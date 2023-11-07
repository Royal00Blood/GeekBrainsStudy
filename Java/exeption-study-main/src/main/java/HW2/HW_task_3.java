package HW2;

public class HW_task_3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        if (b != 0) {
            System.out.println(a/b);
        }

        printSum(23, 234) ;
        int[] abc = {1, 2} ;
        if (3 < abc.length) abc[3] = 9;
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
