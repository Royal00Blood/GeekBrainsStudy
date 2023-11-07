package  Homework.HomeWork_2;

public class Treadmill extends Block{
    private double pathLength;
    public Treadmill(double pathLength) {
        this.pathLength = pathLength;
    }
    @Override
    public boolean checkOpportunity(Creature object) {
        return object.run(pathLength);
    }
}
