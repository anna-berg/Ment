package com.berg.homework1226.homework.thread;

import com.berg.homework1226.homework.util.NightConst;
import com.berg.homework1226.homework.util.ThreadUtil;

public class Night extends Thread{

    private final Object lock = new Object();

    @Override
    public void run() {
        int nightCount = 0;
        while (!ThreadUtil.gotWinner) {
            synchronized (lock) {
                try {
                    System.out.printf("----------------\nNight %s started\n", (++nightCount));
                    lock.notifyAll();
                    lock.wait(NightConst.NIGHT_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Object getLock() {
        return lock;
    }
}
