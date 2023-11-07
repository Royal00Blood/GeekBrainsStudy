package HW5;

public class Main {
    public static void main(String[] args) {
        // body
        MapCreate map = new MapCreate();
        PathMarking path = new PathMarking();
        CountPaths countP = new CountPaths();
        DateConstructor print = new DateConstructor();
        // Маркировка маршрута
        map.MapCreate();
        print.map=map.getMap();
        print.RawData();

        path.arr = map.getMap();
        path.x =map.getStart().getX();
        path.y =map.getStart().getY();
        path.PathMarking();

        print.map=path.getPathMarking();
        print.RawData();

        countP.array= path.getPathMarking();
        countP.finishPoint = map.getFinishPoint();
        countP.CountPaths();

        print.map= countP.getMap();
        print.RawData();

        //выбор пути
        // countP.array = path.getPathMarking();
        // countP.finishPoint = path.
        // end
        
    }
    
}
