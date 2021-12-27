package com.berg.homework1226.practice.produserconsumer;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("Consumer get value " + removedValue + " Sise: " + list.size());
                } else {
                    System.out.println("Consumer is waiting. List is empty");
                }
                try {
                    int random = RandomUtil.getRandom();
                    System.out.println("consumer wait: " + random);
                    list.notifyAll();
                    list.wait(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
