package Homework.HW_7;

import Homework.HomeWork_3.game.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static ArrayList<String> history;
    public static StatusDo status;

    public static void main(String[] args) {

        int num = 0;
        history = new ArrayList<>();
        status = StatusDo.START;
        history.add(status.toString());

        while (status != StatusDo.END) {
            System.out.println("Выберете с какими числами хотите работать:");
            System.out.println("   > 1- стандартный    ");
            System.out.println("   > 2- для комплексных чисел ");
            System.out.println("   > 3- я передумал , выйти ");
            System.out.println("   > 4- История операций ");

            Scanner in = new Scanner(System.in);

            while (num < 1 || num > 4) {
                System.out.print("Выберите игру, введя соответствующую цифру: ");
                try {
                    num = in.nextInt();
                } catch (ArithmeticException | NullPointerException e) {
                    System.out.println("Что-то пошло не так!Попробуйте еще раз <^_^>");
                    status = StatusDo.ERROR;
                    history.add(status.toString());
                    break;

                } catch (Exception e) {
                    System.out.println("Что-то пошло не так. Но это точно не ArithmeticException и не NPE.Попробуйте еще раз <^_^>");
                    status = StatusDo.ERROR;
                    history.add(status.toString());
                    break;
                }
            }

            if (num == 2 || num == 1) {
                NumberInt number1 = enterNumber(num);
                NumberInt number2 = enterNumber(num);
                NumberInt result  = calculate(number1, number2);
                if(num==1) {
                    String str =((DoubleNumber) number1).getNumber()+" "+status.toString()+" "+((DoubleNumber) number2).getNumber() +" = "+((DoubleNumber) result).getNumber();
                    history.add(str);
                    System.out.println(str);
                }
                else {
                    String srtReal =((ComplexNumber) number1).getReal() + " + " +"i "+ ( ((ComplexNumber) number1).getImaginary());
                    String strIme  =((ComplexNumber) number2).getReal() + " + " +"i "+ ( ((ComplexNumber) number2).getImaginary());
                    String strCom  =((ComplexNumber) result).getReal() + " + " +"i "+ ( ((ComplexNumber) result).getImaginary());
                    System.out.println(srtReal+" "+ status.toString()+" "+ strIme+" = "+strCom);
                    history.add(srtReal+" "+ status.toString()+" "+ strIme+" = "+strCom);
                }
            }
            if (num==3){
                history.add(status.toString());
                status = StatusDo.END;

            }
            if(num==4){
                for (String i :history) {
                    System.out.println(i);
                }
            }
            num = 0;
        }
    }

    public static NumberInt calculate(NumberInt number1, NumberInt number2) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите какое действие хотите сделать( +, -, *, /):");
        while(true){
            String doNum = in.nextLine();
            switch (doNum) {
                case "+":
                    status = StatusDo.SUM;
                    return number1;
                case "-":

                    number1.sub(number2);
                    status = StatusDo.SUB;
                    return number1;
                case "*":
                    number1.mul(number2);
                    status = StatusDo.MUL;
                    return number1;
                case "/":
                    number1.div(number2);
                    status = StatusDo.DIV;
                    return number1;
                default:
                    System.out.println("Простите, но вы допустили ошибку. Попробуйте еще раз <^_^>");
                    status = StatusDo.ERROR;
                    history.add(status.toString());
            }
        }
    }

    public static NumberInt enterNumber(int num) {
        NumberInt number;
            if (num == 1) {
                System.out.print("Отлично вы выбрали обычные числа: ");
                System.out.print("Введите  число: ");
                double numberIn = enterNumberCheck();
                number = new DoubleNumber(numberIn);
                return number;
            }
            else {
                System.out.print("Отлично вы выбрали комплексные числа: ");
                System.out.print("Введите реальную часть числа: ");
                double real = enterNumberCheck();
                System.out.print("Введите мнимую часть числа: ");
                double imag = enterNumberCheck();
                number = new ComplexNumber(real, imag);
                return number;
            }
        }

    public static double enterNumberCheck(){
        Scanner in = new Scanner(System.in);
        while (true) {
            double number = 0;
            try {
                number = in.nextInt();
                return number;
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Что-то пошло не так!Попробуйте еще раз <^_^>");
                status = StatusDo.ERROR;
               break;
            } catch (Exception e) {
                System.out.println("Что-то пошло не так. Но это точно не ArithmeticException и не NPE.Попробуйте еще раз <^_^>");
                status = StatusDo.ERROR;
                break;
            }
        }
        return enterNumberCheck();
    }

}


