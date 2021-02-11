package com.kozachenko.lesson.lesson18;

import java.util.*;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        List<Student> students = getStudents(10);
//        System.out.println("Old Variant");
//        System.out.println(oldVariant(students));
//        System.out.println("Stream Variant");
//        System.out.println(streamVariant(students));

        groupingByExample();
    }


    static List<Student> getStudents(int studentAmount){
        List<Student> students = new ArrayList<>();
        Double rangeMin = 50d;
        Double rangeMax = 100.0;
        Random r = new Random();
        for (int i = 0; i < studentAmount; i++){
            Double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            students.add(new Student("Name", "SurName",
                    Math.ceil(randomValue)));
        }
        System.out.println(students);
        return students;
    }

    public static List<Student> oldVariant(List<Student> students){
        List<Student> studentsScore = new ArrayList<>();
        for(Student s : students) {
            if(s.getScore() > 90.0) {
                studentsScore.add(s);
            }
        }
        Collections.sort(studentsScore, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(
                        s1.getScore(), s2.getScore());
            }
        });
        return studentsScore;
    }

    public static List<Student> streamVariant(List<Student> students){
        List<Student> studentsScore = students
                .stream()
                .filter(s -> s.getScore() >= 90.0)
                .sorted(Comparator.comparing(Student::getScore))
                .collect(Collectors.toList());
        return studentsScore;
    }

    public static void createStreamVariants(){
        //first
        List<String> words = Arrays.asList("hello", "hola", "hallo", "ciao");
        Stream<String> stream1 = words.stream();
        //second
        Stream<String> stream2 = Stream.of("hello","hola", "hallo", "ciao");
        //third
        String[] words2 = {"hello", "hola", "hallo", "ciao"};
        Stream<String> stream = Stream.of(words2);
        //forth
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(nums).count());
        //fifth
        System.out.println(IntStream.of(nums).count());
        //sixth
        Stream<Double> doubleStream = Stream.generate(new Supplier<Double>() {
            public Double get() {
                return Math.random();
            }
        }).limit(5);
        //seventh
        Stream<Integer> integerStream = Stream.iterate(1, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 2; }
        }).limit(5);
        integerStream.forEach(System.out::println);
        //eighth
        Stream.Builder<String> builder =
                Stream.<String>builder()
                        .add("h").add("e").add("l").add("l");
        builder.accept("o");
        Stream<String> stringStream = builder.build();
        stringStream.forEach(System.out::print);
        //ninth
        // stream of 1, 2, 3
        IntStream s = IntStream.range(1, 4);
        // stream of 1, 2, 3, 4
        IntStream s2 = IntStream.rangeClosed(1, 4);
        //tenth
        IntStream s1 = new Random().ints(5, 1, 10);
        s1.forEach(System.out::print);
    }

    public static void streamUsageExample(){
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
                .map(String::length)
                .filter(i -> i > 3)
                .limit(2)
                .forEach(System.out::println);
    }
    public static void streamUsageExample2(){
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
                .map(str -> {
                    System.out.println("Mapping: " + str);
                    return str.length();
                })
                .filter(i -> {
                    System.out.println("Filtering: " + i);
                    return i > 3;
                })
                .limit(2)
                .forEach(System.out::println);
    }

    public static void methodFilterUsage(){
        List<String> words = Arrays.asList("hello", null, "","hola", "hallo", "ciao");
        words.stream()
                .filter(t -> t != null && !t.isEmpty())
                .forEach(System.out::println);
    }

    public static void methodDistinctAndSorted(){
        List<String> words = Arrays.asList("hello", null, "world","hi");
        words.stream()
                .filter(Objects::nonNull)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    public static void methodMinUsage(){
        List<String> strings = Arrays.asList("Stream",
                "Operations", "on", "Collections");
        Optional<String> optional = strings.stream()
                .min(Comparator.comparing(String::length));
        optional.ifPresent(System.out::println);
    }

    public static void sumUsage(){
        System.out.println(
                IntStream.of(28,4,91,30).sum()
        );
    }

    public static void averageUsage(){
        System.out.println(
                IntStream.of(28,4,91,30).average()
        );
    }

    public static void collectExample(){
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());

        System.out.println(filteredPhones);
    }

    public static void collectExample2(){
        Stream<String> phones = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        HashSet<String> filteredPhones = phones.filter(s -> s.length() < 8)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(filteredPhones);
    }

    public static void collectExample3(){
        Stream<ColorBox> stream = Stream.of(new ColorBox(1, 1, 1, "red"),
                new ColorBox(2, 2, 2, "green"),
                new ColorBox(3, 3, 3, "blue"),
                new ColorBox(4, 4, 4, "black"));


        Map<String, ColorBox> map = stream
                .collect(Collectors.toMap(box -> box.getColorName(), box -> box));

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public static void groupingByExample(){
        Map<Integer, List<Integer>> map1 =
                Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                        .collect(Collectors.groupingBy(i -> i / 10 * 10));
        System.out.println(map1);

        Map<Integer, Long> map2 =
                Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                        .collect(Collectors.groupingBy(i -> i / 10 * 10,
                                Collectors.counting()));
        System.out.println(map2);
    }

}
