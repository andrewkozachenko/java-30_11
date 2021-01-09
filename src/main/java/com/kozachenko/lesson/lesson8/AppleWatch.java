package com.kozachenko.lesson.lesson8;

public class AppleWatch extends Watch {
    public AppleWatch() {
        System.out.println(" AppleWatch without parameters");

    }

    public AppleWatch(String mark, String model) {
        super(mark, model);
        System.out.println("AppleWatch with parameters mark, model");

    }

}
