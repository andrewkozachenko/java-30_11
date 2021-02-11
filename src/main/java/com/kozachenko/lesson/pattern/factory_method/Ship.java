package com.kozachenko.lesson.pattern.factory_method;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("I deliver everything by see");
    }
}
