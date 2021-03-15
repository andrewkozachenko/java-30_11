package com.kozachenko.lesson.lesson26;

public class AccountDanger {
    public static void main(String[] args) {
        Account account = new Account();
        Thread one = new Thread(account);
        Thread two = new Thread(account);
        Thread three = new Thread(account);
        one.setName("Sasha");
        two.setName("Tania");
        three.setName("Tonia");
        one.start();
        two.start();
        three.start();
    }
}
