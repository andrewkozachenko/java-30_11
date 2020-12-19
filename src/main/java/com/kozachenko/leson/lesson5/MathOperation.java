package com.kozachenko.leson.lesson5;

public class MathOperation {
    //TODO: 1. simple java types
    //TODO: 2. Classes
    //TODO: 3. OOP


    public int sum(int a, int b){
        return a+b;
    }

    public int multiplication(int a, int b){
        int result = a*b;
        return result;
    }

    public int divide(int a, int b){
        String message = "You can't divide by zero";
        int ZERO_NUMBER = 0;
        int result = ZERO_NUMBER;
        if(b == ZERO_NUMBER){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        result = a/b;
        return result;
    }

    public int difference(int a, int b){
        return a-b;
    }
}
