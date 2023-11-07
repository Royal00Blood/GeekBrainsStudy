package HW_Seminar_2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

public class task_1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String [] str = in.nextLine().split(",");
        String [] resultStr = FormatingSTR(str);
        String str_out = CreateStr(resultStr);
        System.out.println(str_out);
    }

    private static String[] FormatingSTR(String[] str) {
        for(int i = 0; i < str.length;i++)
        {
            str[i] = str[i].replace(":", "=");
            str[i] = str[i].replace("\"", "");
            str[i] = str[i].replace("{", "");
            str[i] = str[i].replace("}", "");
            str[i] = str[i]+"'";
            int index = str[i].indexOf('=');
            StringBuilder sb = new StringBuilder(str[i]);
            sb.insert(index+1,"'");
            str[i] = sb.toString();
        }
        return str;
    }

    private static String CreateStr(String[] str) {
        StringBuilder str_bild = new StringBuilder("select * from students where ");
        if ( countMatches(str[0], "null") == 0 ){str_bild.append(str[0]);}
        for(int i = 1; i < str.length; i++){
            if ( countMatches(str[i], "null") == 0 ){
                str_bild.append(" and ");
                str_bild.append(str[i]);
            }
        }
        return str_bild.toString();
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
        Matcher matcher = Pattern.compile(str).matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
