package HW5;
//
import java.util.Scanner;

//
public class MapCreate {
    int [][] arr;
    Point2D startPoint = new Point2D(0, 0);
    int [] finishPoint;
    // Map setings
    public  void MapCreate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Строим карту ");
        System.out.print("Введите количество строк: ");
        int row = input.nextInt();
        System.out.print("Введите количество столбцов: ");
        int col = input.nextInt();
        int[][] array = new int[row][col];
        this.arr = array;
        StartPosition();
        PointsFinish();
        ArrayCreat();
    } 

   
    // Map setings

    public void StartPosition(){
        // init
        Scanner input = new Scanner(System.in);
        String str_2 = String.format("Вводите значение в диапазоне от ", 1, " до " , this.arr.length - 2);
        // body
        System.out.println("Точка старта ");
        System.out.println(str_2);
        while(true){
        System.out.print("Введите номер строки: ");
        startPoint.x = input.nextInt();
            if(startPoint.getX() > 0 && startPoint.getX() < this.arr.length - 1){
                break;
            }
            else{
                System.out.println("Вы вышли за пределы возможного диапазона ");
                System.out.println(str_2);
            }
        }
        while(true){
        System.out.print("Введите номер столбца: ");
        startPoint.y = input.nextInt();
            if(startPoint.getY() > 0 && startPoint.getY() < this.arr.length - 1){
                break;
            }
            else{
                System.out.println("Вы вышли за пределы возможного диапазона ");
                System.out.println(str_2);
            }
        }
        
        
    }

    public void PointsFinish(){
            // init
        Scanner input = new Scanner(System.in);
        System.out.print("Введите введите количество выходов: ");
        int countPoint = input.nextInt();

        int [] points = new int[countPoint*2];
        // body
            // Записываем в массив по 2 элемента => шаг увеличиваем на 2
            for (int i = 0; i < countPoint; i+=2) {
                String str = String.format("Ввод точки финиша № ", i);
                String str_2 = String.format("Вводите значение в диапазоне от ", 1, " до " , this.arr.length - 2);
                System.out.println(str);
                System.out.println(str_2);

                while(true){
                    System.out.print("Введите номер строки: ");
                    points[i] = input.nextInt();

                    if(points[i] > 0 && points[i] < this.arr.length - 1){
                        break;
                    }
                    else{
                        System.out.println("Вы вышли за пределы возможного диапазона ");
                        System.out.println(str_2);
                    }

                }

                while(true){
                    System.out.print("Введите номер столбца: ");
                    points[i+1] = input.nextInt();

                    if(points[i+1] > 0 && points[i+1] < this.arr.length - 1){ 
                        break;
                    }
                    else{
                        System.out.println("Вы вышли за пределы возможного диапазона ");
                        System.out.println(str_2);
                    }

                }
            }
        // end
        this.finishPoint = points;
    }

    public void ArrayCreat() {
        // создание массива-карты
        //////////////////////
        // -1  -> стена
        // -5  -> финиш
        //  1  -> старт 
        //////////////////////
        // формируем стены 
        for (int i = 0; i < arr.length; i++) {
        this.arr[0][i] = -1;
        this.arr[arr.length-1][i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
        this.arr[i][0] = -1;
        this.arr[i][arr.length-1] = -1;
        }
        // обозначаем старт 
        this.arr[startPoint.getX()][startPoint.getY()] = 1;
        // наносим финишные точки
        for (int i = 0; i < finishPoint.length; i+=2) {
            this.arr[finishPoint[i]][finishPoint[i+1]] = -5;
        }
    }  


    public int [] getFinishPoint(){
        return finishPoint;
    }

    public Point2D getStart(){
        return startPoint;
    }
    
    public int[][] getMap() {
        return arr;
    }
}
