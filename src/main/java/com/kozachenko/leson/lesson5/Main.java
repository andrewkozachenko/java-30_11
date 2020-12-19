package com.kozachenko.leson.lesson5;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        MathOperation mathOperation = new MathOperation();
        System.out.println("Sum ==>"            + mathOperation.sum(a,b));
        System.out.println("Multiplication ==>" + mathOperation.multiplication(a,b));
        System.out.println("Divide ==>"         + mathOperation.divide(a,b));
        System.out.println("Difference ==>"     + mathOperation.difference(a,b));
    }
}
