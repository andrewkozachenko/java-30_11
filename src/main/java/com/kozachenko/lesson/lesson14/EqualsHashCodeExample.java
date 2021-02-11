package com.kozachenko.lesson.lesson14;

import java.util.*;

public class EqualsHashCodeExample {


    public static void main(String[] args) {

        TreeSet<One> oneSet = new TreeSet<One>();
        oneSet.add(new One("five"));
        oneSet.add(new One("six"));
        oneSet.add(new One("one"));
        oneSet.add(new One("two"));
        oneSet.add(new One("three"));
        oneSet.add(new One("four"));
        System.out.println(oneSet);

        Object [] oneArray = oneSet.toArray();
        for (Object o : oneArray){
            System.out.printf(((One)o).toString() + "  ");
        }
        System.out.println();
        System.out.println((One)oneArray[2]);

    }
}
