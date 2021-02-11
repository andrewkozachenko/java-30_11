package com.kozachenko.lesson.lesson16.lambda;

import java.util.function.Consumer;

public class Lambda {

    public interface Func {
        int sum(int a, int b);
    }

    public interface Mat{
        int exponeX(int x);
    }

    public static int g =9;

    public static void main(String[] args) {
        Func myAnnonimus = new Func() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int f=10;

        Func myLambda = (a, b) -> (a + b);
        Func mySecondLambda = (int a, int b) -> a*g + b*f;
        Func myThirdLambda = (a,b) -> {
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            Mat mat = e -> (int) (e*2.78);
            if(a%2 == 0){
                a = mat.exponeX(a);
            }
            return a+b;
        };
        MyFunctionalInterface printer = (s) -> System.out.println(s);
        MyFunctionalInterface printer3 = System.out::println;

        printer.printIt(String.valueOf(myAnnonimus.sum(3, 4)));
        printer3.printIt(String.valueOf(myLambda.sum(5, 4)));
        Consumer<String> consumer = System.out::println;
        consumer.accept("Loki");
        printer3.printIt(String.valueOf(myThirdLambda.sum(2,4)));
        printer3.printIt(String.valueOf(mySecondLambda.sum(2,4)));

    }
}
