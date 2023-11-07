package HW1;
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_task {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        test1(arr);
        test2(1,2);
        test3("1");
    }
    public static int[] test1(int[] arr) {
        if(arr.length < 5){throw new ArrayIndexOutOfBoundsException("Массив не содержит 5 элементов");}
        else {for (int i = 1; i < 5; i++) {arr[i] = 0;}}
        return arr;
    }
    public static int test2(int a, int b){
        if (b==0){ throw new RuntimeException("Простите мне неизвестна методика деления на 0");}
        return a / b;
    }
    public static int test3 (String a) {
        boolean isOnlyDigits = true;
        for(int i = 0; i < a.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(a.charAt(i))) {
                throw new NumberFormatException("Я нему приобразовать букву в цифру");
            }
        }
        return Integer.parseInt(a);
    }
}
