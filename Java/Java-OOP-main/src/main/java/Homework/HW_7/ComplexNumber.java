package Homework.HW_7;

import java.util.List;

public class ComplexNumber implements NumberInt{
    private double real;
    private double imaginary;


    /**
     * Создает экземпляр комплексного числа.
     *
     * @param real действительная часть
     * @param imaginary мнимая часть
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает действительную часть числа.
     *
     * @return действительную часть числа
     */
    public double getReal() {
        return real;
    }

    /**
     * Для изменения действительной части числа.
     *
     * @return действительную часть числа
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Возвращает мнимую часть.
     *
     * @return мнимую часть числа
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Для изменения мнимой части числа.
     *
     * @return действительную часть числа
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary < 0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    @Override
    public void sum(NumberInt numberInt) {
        ComplexNumber newN = (ComplexNumber) numberInt;
        this.real      = newN.getReal()      + this.real;
        this.imaginary = newN.getImaginary() + this.imaginary;
    }

    @Override
    public void mul(NumberInt numberInt) {
        ComplexNumber newN = (ComplexNumber) numberInt;
        this.real      = this.real * newN.getReal()      - this.imaginary * newN.getImaginary();
        this.imaginary = this.real * newN.getImaginary() + this.imaginary * newN.getReal();
    }

    @Override
    public void sub(NumberInt numberInt) {
        ComplexNumber newN = (ComplexNumber) numberInt;
        real      = real      - newN.getReal();
        imaginary = imaginary - newN.getImaginary();
    }

    @Override
    public void div(NumberInt numberInt) {
        ComplexNumber newN = (ComplexNumber) numberInt;
        double divNumber = newN.getReal()* newN.getReal() + newN.getImaginary()* newN.getImaginary();
        newN.setImaginary( newN.getImaginary() + -1);
        this.mul(newN);
        real = real/divNumber;
        imaginary = imaginary/divNumber;
    }

}
