package com.berg.homework1226.homework.thread;

import com.berg.homework1226.homework.model.Crystal;
import com.berg.homework1226.homework.util.RandomUtil;
import com.berg.homework1226.homework.util.ThreadUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Planet extends Thread {

    private static final int MAX_CRYSTALS_COUNT = 3;
    private final Night night;
    private final Object lock = new Object();
    private final List<Crystal> crystals = Collections.synchronizedList(new ArrayList<>());

    public Planet(Night night) {
        this.night = night;
    }

    @Override
    public void run() {
        try {
            while (!ThreadUtil.gotWinner) {
                generateCrystal();
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void generateCrystal() {
        int countCrystalsToGenerate = RandomUtil.getNextWithoutZero(MAX_CRYSTALS_COUNT);
        for (int i = 0; i < countCrystalsToGenerate; i++) {
            Crystal crystal = Crystal.CASHED_CRYSTALS.get(RandomUtil.getNext(Crystal.CASHED_CRYSTALS.size()));
            crystals.add(crystal);
        }
        System.out.printf("\nPlanet generated crystals. Count: %s. Total Crystals on planet: %s\n", countCrystalsToGenerate, crystals.size());
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public List<Crystal> removeAll() {
        List<Crystal> removedCrystals = new ArrayList<>(crystals);
        crystals.clear();
        return removedCrystals;
    }

    public boolean isNotEmpty(){
        return !crystals.isEmpty();
    }

    public List<Crystal> getCrystals() {
        return crystals;
    }

    public Object getLock() {
        return lock;
    }
}
