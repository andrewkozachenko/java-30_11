package com.kozachenko.lesson.lesson26;

public class MyQueue {
    int n;

    public synchronized int get() {
        System.out.println("Пoлyчeнo: " + n);
        return n;
    }

    public synchronized void put(int n) {
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
    }
}
