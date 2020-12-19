package com.kozachenko.leson.lesson5;

public abstract class Operation {
    public abstract int sum(int a, int b);

    public abstract int multiplication(int a, int b);

    public abstract int divide(int a, int b);

    public abstract int difference(int a, int b);

    public int mod(int a, int b){
        return a%b;
    }
}
