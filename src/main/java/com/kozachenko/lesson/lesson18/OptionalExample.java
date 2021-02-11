package com.kozachenko.lesson.lesson18;

import java.util.Optional;

public class OptionalExample {

    private static Optional<String> emptySummary = Optional.empty();

    private static Optional<String> summary = Optional.of("A summary");

    private static Optional<String> summary2 = Optional.ofNullable(null);

    public static void isPresentExample(){

        emptySummary.ifPresent(System.out::println);

        if( summary.isPresent() ) {
            // Do something
        }
    }

    public static void getExample(){
        System.out.println(summary.get());
    }

    public static void orElseExample(){
        String summaryOrDefault = summary.orElse("Default summary");
        System.out.println(summaryOrDefault);
    }
    public static void orElseGetExample(){
        String summaryOrDefault =
                summary.orElseGet( () -> "Default summary" );
        System.out.println(summaryOrDefault);
    }

    public static void filterExample(){
        String summaryStr =
                summary.filter(s -> s.length() > 10).orElse("Short summary");
        System.out.println(summaryStr);
    }

    public static void mapExample(){
        int summaryLength = summary.map(s -> s.length()).orElse(0);
        System.out.println(summaryLength);
    }


}
