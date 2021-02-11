package com.kozachenko.lesson.lesson17;

import java.lang.reflect.Field;

class ForReflectionTest {
    private String value;

    public ForReflectionTest() {
    }

    public ForReflectionTest(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ForReflectionTest s  = new ForReflectionTest("admin");
        Class objectClass = s.getClass();
        System.out.println(s);
        Field valueField = objectClass.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(s, "E ron don don");
        System.out.println(s);
//        valueField.set(s, "Fix");

//        System.out.println(s);
//        System.out.println(objectClass.getName());
//        System.out.println(objectClass.getSuperclass());
//        System.out.println(objectClass.getCanonicalName());
//        System.out.println(objectClass.getSimpleName());
//        System.out.println(objectClass.getTypeName());
//        for(Field f : objectClass.getFields()){
//            System.out.println(f.getName());
////        }
//        System.out.println("Declared fields");
//        for(Field f : objectClass.getDeclaredFields()){
//            System.out.println(f.getName());
//        }

        System.out.println();

    }
}
