package  Homework.HomeWork_2;

public class Wall extends Block {
    private double wallHeight;

    public Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean checkOpportunity(Creature object) {
        return object.jump(wallHeight);
    }
}
