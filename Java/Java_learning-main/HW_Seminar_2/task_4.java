package HW_Seminar_2;
/*  Реализуйте простой калькулятор, с консольным интерфейсом. К калькулятору добавить логирование. */

import java.util.Scanner;
import java.util.logging.*;

 
public class task_4 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Logger log = Logger.getLogger(task_4.class.getName());
        ConsoleHandler cl = new ConsoleHandler();
        SimpleFormatter form = new SimpleFormatter();
        
        log.addHandler(cl);
        cl.setFormatter(form);

        int num1 = getInt();
        log.setLevel(Level.INFO);
        log.log(Level.WARNING, "test");
        int num2 = getInt();
        log.setLevel(Level.INFO);
        log.log(Level.WARNING, "test");
        char operation = getOperation();
        log.setLevel(Level.INFO);
        log.log(Level.WARNING, "test");
        int result = calc(num1,num2,operation);
        log.setLevel(Level.INFO);
        log.log(Level.WARNING, "test");
        System.out.println("Результат операции: "+result);
    }
 
    public static int getInt(){
        
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}

