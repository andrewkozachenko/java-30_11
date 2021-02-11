package com.kozachenko.lesson.pattern.factory_method;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
