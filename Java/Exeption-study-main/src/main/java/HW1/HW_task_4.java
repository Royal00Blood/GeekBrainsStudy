package HW1;
import java.util.Arrays;
// Реализуйте метод, принимающий в качестве аргументов
// два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class HW_task_4 {
    public static void main(String[] args) {
        int[] arr1 = {8, 10,0,0};
        int[] arr2 = {4, 5, 0};
        try {
            int[] result = divArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] divArrays(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException("Деление на ноль невозможно");
            }
            else {
                result[i] = arr1[i] / arr2[i];
            }
        }
        return result;
    }
}
