package com.kozachenko.lesson.lesson9.exception;

import java.io.IOException;
import java.util.Arrays;

class Razor{

    public void say(){
        System.out.println("Hello!");
    }

}

public class Main {
    public static void main(String[] args) {
        Razor r = new Razor();
//        int array [] = new int[3];
//        Integer array1 [] = {3, null, 3};
//        System.out.println(array1[1]); // case 1
//        System.out.println(array1[3]); // case
        try {
            throw new NullPointerException("This is my first NullPointerException");
//            getNullPointer(r);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("This is NullPointerException");
        } catch (RuntimeException re){
            System.out.println("This is runtime exception");
        } catch (Exception e){
            System.out.println("Exception catch");
        } finally {
            System.out.println("I am finally block of code");
        }
    }

    private static void getException() throws ArithmeticException{
        new ArithmeticException();
    }

    private static void getNullPointer(Razor r){
        if(r != null){
            r = null;
        }
        r.say();
    }



}
