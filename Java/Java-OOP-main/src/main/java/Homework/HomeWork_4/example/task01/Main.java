package Homework.HomeWork_4.example.task01;

public class Main {
    public static void main(String[] args) {
        SimpleBox sb1 = new SimpleBox(10);
        SimpleBox sb2 = new SimpleBox(20);
        //sb2.setNewObject("123");
        if (sb1.getNewObject() instanceof Integer && sb2.getNewObject() instanceof Integer) {
            int sum = (Integer) sb1.getNewObject() + (Integer) sb2.getNewObject();
            System.out.println(sum);
        }

        GenBox<String> gb1 = new GenBox<>("123");
        GenBox<Integer> gb2 = new GenBox<>(30);
        GenBox<Integer> gb3 = new GenBox<>(20);
        int sum2 = gb2.getNewT() + gb3.getNewT();
        System.out.println(sum2);
    }
}