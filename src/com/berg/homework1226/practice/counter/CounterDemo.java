package com.berg.homework1226.practice.counter;

public class CounterDemo {

    public static void main(String[] args) {
        var counter = new Counter();
        var counterThread1 = new CounterThread(counter);
        var counterThread2 = new CounterThread(counter);
        var counterThread3 = new CounterThread(counter);
        var counterThread4 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();

        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
