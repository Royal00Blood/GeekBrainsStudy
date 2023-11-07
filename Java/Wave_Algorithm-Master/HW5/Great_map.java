package HW5;

// библиотеки
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
//........
/**
 * Основной метод класса
 */
public class Great_map {
    public static void main(String[] args) {
        // body
        int[][] arr = MapCreate();
        
        //начальные данные ..
        int [] pointStart = StartPosition(arr);
        int [] pointsFinish = PointsFinish(arr);
        
        //
        ArrayCreat(arr, pointStart, pointsFinish);
        // Маркировка маршрута
        PathMarking(arr, pointStart[0], pointStart[1]);
        System.out.println(RawData(arr));
        //выбор пути
        CountPaths(arr, pointsFinish);
        // end
        System.out.println(RawData(arr));
    }
    /**
     * Форматированный вывод карты в консоль
     * @param map - карта 
     * @return  форматированный вывод
     */
    static String RawData(int[][] map) {
        // init
        StringBuilder sb = new StringBuilder();
        // body
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%3d",map[row][col]));
            }
            sb.append("\n");
        }
        // end
        return sb.toString();
    }
    /**
     * Метод создания пустой карты
     * @return двумерный массив карта
     */
    private static int[][] MapCreate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Строим карту ");
        System.out.print("Введите количество строк: ");
        int row = input.nextInt();
        System.out.print("Введите количество столбцов: ");
        int col = input.nextInt();
        int[][] array = new int[row][col];
        return array;
    } 
    /**
     * Метод задания стартовой точки
     * @param arr массив карты
     * @return массив точки страрта
     */
    private static int[] StartPosition(int arr[][]){
        // init
        Scanner input = new Scanner(System.in);
        int [] point = new int[2];
        String str_2 = String.format("Вводите значение в диапазоне от  ", 1, " до " , arr.length - 2);
        // body
        System.out.println("Точка старта ");
        System.out.println(str_2);
        while(true){
        System.out.print("Введите номер строки: ");
        point[0] = input.nextInt();
            if(point[0] > 0 && point[0] < arr.length - 1){
                break;
            }
            else{
                System.out.println("Вы вышли за пределы возможного диапазона ");
                System.out.println(str_2);
            }
        }
        while(true){
        System.out.print("Введите номер столбца: ");
        point[1] = input.nextInt();
            if(point[1] > 0 && point[1] < arr.length - 1){
                break;
            }
            else{
                System.out.println("Вы вышли за пределы возможного диапазона ");
                System.out.println(str_2);
            }
        }
        return point;
    }
    /**
     * 
     * @param arr массив карты
     * @param start массив формата [row,col] - начальная точка
     * @param finish массив формата [row,col,...] точки финиша
     */
    public static void ArrayCreat(int[][] arr,int[] start, int []finish) {
         for (int i = 0; i < arr.length; i++) {
            arr[0][i] = -1;
            arr[arr.length-1][i] = -1;
         }
         for (int i = 0; i < arr.length; i++) {
            arr[i][0] = -1;
            arr[i][arr.length-1] = -1;
         }
        arr[start[0]][start[1]] = 1;
        for (int i = 0; i < finish.length; i+=2) {
            arr[finish[i]][finish[i+1]] = -5;
        }
    }


    /**
     * 
     * @param arr массив карты
     * @return массив точек финиша формата [row_1,col_1,row_2,col_2...]
     */
    private static int[] PointsFinish(int arr[][]){
        // init
        Scanner input = new Scanner(System.in);
        System.out.print("Введите введите количество выходов: ");
        int countPoint = input.nextInt();

        int [] points = new int[countPoint*2];
        // body
            // Записываем в массив по 2 элемента => шаг увеличиваем на 2
            for (int i = 0; i < countPoint*2; i+=2) {
                String str = String.format("Ввод точки финиша № ", i);
                String str_2 = String.format("Вводите значение в диапазоне от ", 1, " до " , arr.length - 2);
                System.out.println(str);
                System.out.println(str_2);

                while(true){
                    System.out.print("Введите номер строки: ");
                    points[i] = input.nextInt();

                    if(points[i] > 0 && points[i] < arr.length - 1){
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

                    if(points[i+1] > 0 && points[i+1] < arr.length - 1){ 
                        break;
                    }
                    else{
                        System.out.println("Вы вышли за пределы возможного диапазона ");
                        System.out.println(str_2);
                    }

                }
            }
        // end
        return points;
    }

    /**
     * Маркировка маршрутов
     * @param arr массив карты
     * @param x номер строки
     * @param y номер столбца
     */
    public static void PathMarking(int[][] arr, int x, int y) {
        //[строка][столбец]
        // init
        int[] row = new int[arr.length*arr.length]; 
        int[] col = new int[arr.length*arr.length];
        int index = 0; 
        int index2 = 0; 
        // body
            do {
                if ( arr[x-1][y] == 0){
                    arr[x-1][y] = arr[x][y] + 1;
                    row[index] = x-1;
                    col[index] = y;
                    index ++;
                }
                if (arr[x][y+1] == 0){
                    arr[x][y+1] = arr[x][y] + 1;
                    row[index] = x;
                    col[index] = y+1;
                    index ++;
                }
                if (arr[x+1][y] == 0){
                    arr[x+1][y] = arr[x][y] + 1;
                    row[index] = x+1;
                    col[index] = y;
                    index ++;
                }
                if ( arr[x][y-1] == 0){
                    arr[x][y-1] = arr[x][y] + 1;
                    row[index] = x;
                    col[index] = y-1;
                    index ++;
                }
                x = row[index2];
                y = col[index2];
                index2 ++;
            } 
        while (row[index2] != 0 && col[index2] != 0 );
    }
    /**
     * Маркировка кратчайшего маршрута  нулями
     * @param array массив карты 
     * @param finishPoint - массив точек финиша
     */
    private static void CountPaths( int[][]array, int [] finishPoint){
        Queue<Point2D> queue = new LinkedList<Point2D>();
        LinkedList<LinkedList> midle = new LinkedList<>();
        int index =0;
        int ii = 0;
        int index_list[] = new int[finishPoint.length/2];
        for (int i = 0; i < finishPoint.length; i+=2) {
            
            int x = finishPoint[i];
            int y = finishPoint[i+1];
            Point2D pointXY= new Point2D(finishPoint[i],finishPoint[i+1]);
            queue.add(pointXY);
            
            while(array[x][y]!=1){
                if(array[x][y] ==-5){
                    if (array[x-1][y] > 0 && array[x-1][y] > array[x][y] ){
                        x --;
                        index ++;
                        queue.add(new Point2D(x, y));
                    
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x][y+1] > 0 && array[x][y+1] > array[x][y] ){
                        y ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x+1][y] > 0 && array[x+1][y] > array[x][y] ){
                        x ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x][y-1] > 0 && array[x][y-1] > array[x][y] ){
                        y --;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (array[x][y] == 1)  break;
                    } 
                
                }
                    if (array[x-1][y] > 0 && array[x-1][y] < array[x][y] ){
                        x --;
                        index ++;
                        queue.add(new Point2D(x, y));
                       
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x][y+1] > 0 && array[x][y+1] < array[x][y] ){
                        y ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                 
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x+1][y] > 0 && array[x+1][y] < array[x][y] ){
                        x ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                       
                        if (array[x][y] == 1) break;
                    }
                    else if (array[x][y-1] > 0 && array[x][y-1] < array[x][y] ){
                        y --;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (array[x][y] == 1)  break;
                    } 
            }
            
            index_list[ii] = index;
            ii ++;
            index = 0;
            midle.add(new LinkedList<>(queue));
        }
        
        int ind_min = 0;
        int min = index_list[0];
        for (int j = 0; j < index_list.length; j++) {
            if(index_list[j]<min){
             min = index_list[j]; 
             ind_min = j;
            }
        }
        Queue<Point2D> queue_1 = midle.get(ind_min);
        Point2D point_queue = new Point2D(0, 0);
        while(queue_1.size()!= 0){
            point_queue = queue_1.poll();
            array[point_queue.getX()][point_queue.getY()] = 0;
        }        
         System.out.println(RawData(array));
    }
}

