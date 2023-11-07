package Homework.HomeWork_4.example.task02;

public class BoxWithNumber<T extends Number> {
    private T[] item;

    public BoxWithNumber(T... item) {
        this.item = item;
    }

    public Double average (){
        double sum = 0;
        for (T t: item)
            sum += t.doubleValue();
        return sum/item.length;
    }

    public boolean compareAverage(BoxWithNumber<?> enotherItems){
        return (Math.abs(this.average() - enotherItems.average()) < 0.001);
    }

    public T[] getItem() {
        return item;
    }

    public void setItem(T[] item) {
        this.item = item;
    }
}
