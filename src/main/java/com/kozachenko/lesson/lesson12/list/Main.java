package com.kozachenko.lesson.lesson12.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        oldCollectionApproach();
        newCollectionApproach();
    }

    static class Book {
        public String name;
        public String Author;

        public Book() {
        }

        public Book(String name, String author) {
            this.name = name;
            Author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", Author='" + Author + '\'' +
                    '}';
        }
    }

    private static void newCollectionApproach() {

        List<Book> books = new ArrayList();
        books.add(new Book("Harry Potter And Closet", "J.Rolling"));
        books.add(new Book("Pro Git",
                "Scott Chacon, Ben Straub"));
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", "Duglas Adams"));
        books.add(new Book("The book of Numbers", "Author"));

        List<Book> classicBooks = new ArrayList<>();
        classicBooks.add(new Book("Master and Margarita", "Buhakov"));
        classicBooks.add(new Book("Eneida", "Kotlarevskii"));
        classicBooks.add(new Book("Evgenii Onegin", "A.S.Pushkin"));

        books.addAll(classicBooks);
        System.out.println(books.size());
        System.out.println(books.get(4));
        System.out.println();
        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
            if (book.Author.equals("J.Rolling")) {
                iterator.remove();
            }
        }


        System.out.println();
        for (int i = 0; i < books.size(); i++) {
            books.remove(2);
            System.out.println(books.get(i));
        }

    }


    private static void oldCollectionApproach() {
        class Orange {
            public Orange() {
                System.out.println("I am funny Orange!");
            }

            public String getJuice() {
                return "Take juice";
            }
        }
        class Bear {
            String text = "I am a gummy Bear!";

            public Bear() {
                System.out.println(text);
            }

            public String sing() {
                return text + " " + text;
            }
        }
        Collection<Object> oranges = new ArrayList<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Bear());

        for (Object o : oranges) {
            if (o instanceof Orange) {
                Orange orange = (Orange) o;
                System.out.println(orange.getJuice());
            } else {
                throw new InputMismatchException("Hey dude you put some bullshit!");
            }
        }
    }
}
