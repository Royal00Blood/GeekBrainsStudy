package Homework.HW_7;

public class DoubleNumber implements NumberInt{

    public DoubleNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    double number;
    @Override
    public void sum(NumberInt numberInt) {
          DoubleNumber num = (DoubleNumber) numberInt;
          number = number + num.getNumber();
    }

    @Override
    public void mul(NumberInt numberInt) {
        DoubleNumber num = (DoubleNumber) numberInt;
        number = number * num.getNumber();
    }

    @Override
    public void sub(NumberInt numberInt) {
        DoubleNumber num = (DoubleNumber) numberInt;
        number = number - num.getNumber();
    }

    @Override
    public void div(NumberInt numberInt) {
        DoubleNumber num = (DoubleNumber) numberInt;
        number = number / num.getNumber();
    }
}
