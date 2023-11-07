package Homework.HomeWork_4.example.task01;

public class SimpleBox <Object> {
    private Object newObject;

    public SimpleBox(Object newObject) {
        this.newObject = newObject;
    }

    public Object getNewObject() {
        return newObject;
    }

    public void setNewObject(Object newObject) {
        this.newObject = newObject;
    }
}
