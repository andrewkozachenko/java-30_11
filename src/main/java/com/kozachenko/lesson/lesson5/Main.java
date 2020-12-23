package com.kozachenko.lesson.lesson5;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double a = 10.88;
        int b = 3;
        Operation operation = OperationFactory.getOperation(a,b);
        System.out.println("Sum ==>"            + operation.sum(a,b));
        System.out.println("Multiplication ==>" + operation.multiplication(a,b));
        System.out.println("Divide ==>"         + operation.divide(a,b));
        System.out.println("Difference ==>"     + operation.difference(a,b));
        long runningTime = System.currentTimeMillis()-startTime;
        System.out.println("Running time " + runningTime);
    }
}
