package HW2;
import java.util.Scanner;
//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.
public class HW_task_4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите не пустую строку");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)) {
            throw new Exception("Строка пуста");
        } else {
            System.out.println("Ваша строка: " + str);
        }

    }
}
