package com.kozachenko.lesson.lesson27.forTest;

public class Calculator {

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("You should not divide by zero");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divideInt(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("You should not divide by zero");
        }
        return a / b;
    }
}
