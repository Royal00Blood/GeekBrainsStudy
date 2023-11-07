package HW5;

import java.util.LinkedList;
import java.util.Queue;


public class CountPaths {
    int [][] array;
    int [] finishPoint;
   

   public void CountPaths(){
        Queue<Point2D> queue = new LinkedList<Point2D>();
        LinkedList<LinkedList> midle = new LinkedList<>();
        int index =0;
        int ii = 0;
        int index_list[] = new int[this.finishPoint.length/2];
        for (int i = 0; i < this.finishPoint.length; i+=2) {
            
            int x = this.finishPoint[i];
            int y = this.finishPoint[i+1];
            Point2D pointXY= new Point2D(this.finishPoint[i],this.finishPoint[i+1]);
            queue.add(pointXY);
            
            while(this.array[x][y]!=1){
                if(this.array[x][y] ==-5){
                    if (this.array[x-1][y] > 0 && this.array[x-1][y] > this.array[x][y] ){
                        x --;
                        index ++;
                        queue.add(new Point2D(x, y));
                    
                        if (this.array[x][y] == 1) break;
                    }
                    else if (this.array[x][y+1] > 0 && this.array[x][y+1] > this.array[x][y] ){
                        y ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (this.array[x][y] == 1) break;
                    }
                    else if (this.array[x+1][y] > 0 && this.array[x+1][y] > this.array[x][y] ){
                        x ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (this.array[x][y] == 1) break;
                    }
                    else if (this.array[x][y-1] > 0 && this.array[x][y-1] > this.array[x][y] ){
                        y --;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (this.array[x][y] == 1)  break;
                    } 
                
                }
                    if (this.array[x-1][y] > 0 && this.array[x-1][y] < this.array[x][y] ){
                        x --;
                        index ++;
                        queue.add(new Point2D(x, y));
                       
                        if (array[x][y] == 1) break;
                    }
                    else if (this.array[x][y+1] > 0 && this.array[x][y+1] < this.array[x][y] ){
                        y ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                 
                        if (this.array[x][y] == 1) break;
                    }
                    else if (this.array[x+1][y] > 0 && this.array[x+1][y] < this.array[x][y] ){
                        x ++;
                        index ++;
                        queue.add(new Point2D(x, y));
                       
                        if (this.array[x][y] == 1) break;
                    }
                    else if (this.array[x][y-1] > 0 && this.array[x][y-1] < this.array[x][y] ){
                        y --;
                        index ++;
                        queue.add(new Point2D(x, y));
                        if (this.array[x][y] == 1)  break;
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
            this.array[point_queue.getX()][point_queue.getY()] = 0;
        }        
    }

    public int[][] getMap(){
        return this.array;
    }
    
}
