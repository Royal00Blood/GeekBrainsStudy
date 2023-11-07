package Seminar_2;

public class task_5 {
    public static void PathMarking(int[][] arr, int x, int y) {
        //[строка][столбец]
                if (arr[x-1][y]!= -1 && arr[x-1][y] == 0){
                    arr[x-1][y] = arr[x][y] + 1;
                    PathMarking(arr, x-1, y);
                }
                if (arr[x][y+1]!= -1 && arr[x][y+1] == 0){
                    arr[x][y+1] = arr[x][y] + 1;
                    PathMarking(arr, x, y+1);
                }
                if (arr[x+1][y]!= -1 && arr[x+1][y] == 0){
                    arr[x+1][y] = arr[x][y] + 1;
                    PathMarking(arr, x+1, y);
                }
                if (arr[x][y-1]!= -1 && arr[x][y-1] == 0){
                    arr[x][y-1] = arr[x][y] + 1;
                    PathMarking(arr, x, y-1);
                }
    }
    
}
