package HW5;
public class DateConstructor {
int[][] map;

    public void RawData() {
        // init
        StringBuilder sb = new StringBuilder();
        // body
        for (int row = 0; row < this.map.length; row++) {
            for (int col = 0; col < this.map[row].length; col++) {
                sb.append(String.format("%3d",this.map[row][col]));
            }
            sb.append("\n");
        }
        // end
        System.out.println(sb.toString());
    }  
}
