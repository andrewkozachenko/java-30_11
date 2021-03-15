package com.kozachenko.lesson.lesson26;

public class Account implements Runnable {
    private Integer balance = 50;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Make withdraw");
//        synchronized (balance) {
            balance -= amount;
//        }
    }

    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private void makeWithdrawal(int amount) {
        synchronized (balance) {
            if (getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName()
                        + " is going to withdraw");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                withdraw(amount);


                System.out.println(Thread.currentThread().getName()
                        + " completes the withdrawal. The balance is "
                        + getBalance());
            } else {
                System.out.println("Not enough in account for "
                        + Thread.currentThread().getName()
                        + " to withdraw " + getBalance());
            }
        }
    }
}
