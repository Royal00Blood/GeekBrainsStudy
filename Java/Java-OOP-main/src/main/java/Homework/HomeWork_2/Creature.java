package  Homework.HomeWork_2;

abstract public class Creature {
    private String name;
    private double countRun ;
    private double sizeJump ;
    public Creature(String name, double countRun, double sizeJump) {
        this.name = name;
        this.countRun = countRun;
        this.sizeJump = sizeJump;
    }
    public boolean run(double countRunGoal) {
        if(countRunGoal <= countRun){
            System.out.printf("%s ran %f meters.",name,countRunGoal);
            System.out.println();
            return true;
        }
        else {
            System.out.printf("%s didn't run %f meters.", name, countRunGoal);
            System.out.println();
            return false;
        }
    }
    public boolean jump(double countJumpGoal) {
        if(countJumpGoal <= sizeJump) {
            System.out.printf("%s jumped up %f meters.", name, countJumpGoal);
            System.out.println();
            return true;
        }
        else {
            System.out.printf("%s didn't jump up %f meters.", name, countJumpGoal);
            System.out.println();
            return false;
        }
    }
}
