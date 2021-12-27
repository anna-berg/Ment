package com.berg.homework1226.practice.vol;

public class VolatileDemo {

    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("Still false");
            }
        });
        thread1.start();
        Thread.sleep(5L);
        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Flag is set");
        });
        thread2.start();
    }
}
