package com.kozachenko.lesson.pattern.factory_method;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("I deliver everything on the ground");
    }
}
