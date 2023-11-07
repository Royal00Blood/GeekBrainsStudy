package Seminar_2;

public class task_2 
{
   
    public static void main(String[] args) 
    {
        //String sym1= '11112223';
        String sym = "abba";

        if (polindrom(sym))
        {
            System.out.println("It is polindrom");
        }
        System.out.println();

    }

    private static boolean polindrom(String c1)
    {
        boolean flag = false;
        var newString = "";
        
       
        if (newString == c1)
        {
            flag = true;
        }
        return flag;
    }
/* 
    private static String countElements(String c1)
    {
        String out_text;
        String[] strArray = new String[8];
        c1.toArray(strArray);    
        for(int i=0;i< c1.length();i++){
            String element = c1[i];
            if (c1[i]!=c1)
            {

            }

        }
        System.out.println("It is polindrom");
        return out_text;
    }

*/
}
