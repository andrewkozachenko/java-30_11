package com.kozachenko.lesson.pattern.factory_method;

public abstract class Logistics {

    public static void planDelivery(LogisticType type){
        Logistics l = null;
        switch (type){
            case SEA:
                l = new SeaLogistics();
            case GROUND:
                l = new GroundLogistics();
        }
        Transport transport = l.createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
