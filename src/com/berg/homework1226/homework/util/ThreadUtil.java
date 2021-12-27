package com.berg.homework1226.homework.util;

public class ThreadUtil {

    public static boolean gotWinner = false;

    private ThreadUtil() {
    }

    public static void startThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static void joinThreads(Thread... threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }
}
