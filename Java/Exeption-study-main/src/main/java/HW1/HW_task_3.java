package HW1;
import java.util.Arrays;
//Реализуйте метод, принимающий в качестве аргументов
// два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих
// массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
public class HW_task_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,6};
        int[] arr2 = {4, 5, 6};
        try {
            int[] result = diffArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException(" массивы не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
