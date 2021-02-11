package com.kozachenko.lesson.pattern.factory_method;

public class GroundLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
