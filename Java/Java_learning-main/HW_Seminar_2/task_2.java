package HW_Seminar_2;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
/* 
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
*/
public class task_2 {
    public static void main(String[] args) {
        int [] array = CreateArr();
        int[] new_array = SortArray(array);
        ConsoleEnter(new_array);
    }

    private static int[] SortArray(int[] arr) {
        boolean isSorted = false;
        int buf;
        Logger log = Logger.getLogger(task_2.class.getName());
        try {
            FileHandler fl = new FileHandler("log.xml");
            log.addHandler(fl);
            XMLFormatter xml = new XMLFormatter();
            fl.setFormatter(xml);
        }
        catch(IOException ie) {
            ie.printStackTrace();
        }

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    
                }
                log.log(Level.WARNING,"Step "+ i);
            }
        }
        return arr;
    }

    private static int[] CreateArr(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input size array: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Input array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private static void ConsoleEnter(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}