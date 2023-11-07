package HW5;

public class PathMarking {
    int arr[][];
    int x;
    int y;
    
    public void PathMarking() {
        //[строка][столбец]
      
        // init
        int[] row = new int[this.arr.length*this.arr.length]; 
        int[] col = new int[this.arr.length*this.arr.length];
        int index = 0; 
        int index2 = 0; 
        int x = this.x;
        int y = this.y;
        // body
        do {
            if ( this.arr[x-1][y] == 0){
                this.arr[x-1][y] = this.arr[x][y] + 1;
                row[index] =this.x-1;
                col[index] = y;
                index ++;
            }
            if (this.arr[x][y+1] == 0){
                this.arr[x][y+1] = this.arr[x][y] + 1;
                row[index] = x;
                col[index] = y+1;
                index ++;
            }
            if (this.arr[x+1][y] == 0){
                this.arr[x+1][y] = this.arr[x][y] + 1;
                row[index] = x+1;
                col[index] = y;
                index ++;
            }
            if ( this.arr[x][y-1] == 0){
                this.arr[x][y-1] = this.arr[x][y] + 1;
                row[index] = x;
                col[index] = y-1;
                index ++;
            }
            x = row[index2];
            y = col[index2];
            index2 ++;
        } while (row[index2] != 0 && col[index2] != 0 );
    }

    public int [] [] getPathMarking(){
        return arr;
    }

}
