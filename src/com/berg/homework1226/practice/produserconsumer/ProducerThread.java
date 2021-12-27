package com.berg.homework1226.practice.produserconsumer;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int randomValue = RandomUtil.getRandom();
                    list.add(randomValue);
                    System.out.println("Produser adds a value " + randomValue + " Sise: " + list.size());
                } else {
                    System.out.println("Produser does nothing");
                }
                list.notifyAll();
                try {
                    int random = RandomUtil.getRandom(5);
                    System.out.println("Produser waits " + random);
                    list.wait(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
