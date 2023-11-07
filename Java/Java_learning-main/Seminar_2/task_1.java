package Seminar_2;

public class  task_1
{

    public static void main(String[] args) 
        {
            int num = 6;
            char sym1 = 'h';
            char sym2 = 'i';
            System.out.println(makeString(num, sym1, sym2));
        }

    private static String makeString(int num, char c1, char c2)
        {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < num / 2; i++)
                {
                    stringBuilder.append(c1).append(c2);
                }
            return stringBuilder.toString();
        }
}