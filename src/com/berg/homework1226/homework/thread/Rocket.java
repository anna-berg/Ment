package com.berg.homework1226.homework.thread;

import com.berg.homework1226.homework.model.Crystal;
import com.berg.homework1226.homework.model.Wizard;
import com.berg.homework1226.homework.util.RandomUtil;
import com.berg.homework1226.homework.util.ThreadUtil;

import java.util.ArrayList;
import java.util.List;

public class Rocket extends Thread {

    public static final int MAX_CRYSTALS_COUNT = 5;
    private final Night night;
    private final Wizard wizard;
    private final Planet planet;

    public Rocket(Night night, Wizard wizard, Planet planet) {
        this.night = night;
        this.wizard = wizard;
        this.planet = planet;
    }

    @Override
    public void run() {
        try {
            while (!ThreadUtil.gotWinner) {
                System.out.println(wizard.getName() + " rocket start");
                List<Crystal> crystals = gatherCrystalsFromPlanet();
                wizard.addCrystals(crystals);
                haveWinner();
                System.out.printf("%s rocket gathered next crystals: %s, total crystals in wizard: %s, got winner - %s\n",
                        wizard.getName(), crystals.size(),
                        wizard.totalCrystals(), ThreadUtil.gotWinner);
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void haveWinner() {
        Integer totalCrystals = wizard.getCrystals().values().stream().
                reduce(Integer::sum)
                .orElse(0);
        if (totalCrystals >= 500) {
            ThreadUtil.gotWinner = true;
        }
    }

    private List<Crystal> gatherCrystalsFromPlanet() {
        int crystalCount = RandomUtil.getNextWithoutZero(MAX_CRYSTALS_COUNT);
        List<Crystal> gatheredCrystalsFromPlanet = new ArrayList<>(MAX_CRYSTALS_COUNT);
        synchronized (planet.getLock()) {
            if (planet.getCrystals().size() <= crystalCount) {
                gatheredCrystalsFromPlanet.addAll(planet.removeAll());
            } else if (planet.isNotEmpty()) {
                for (int i = 0; i < crystalCount; i++) {
                    Crystal removedCrystal = planet.getCrystals().remove(RandomUtil.getNext(planet.getCrystals().size()));
                    gatheredCrystalsFromPlanet.add(removedCrystal);
                }
                System.out.printf("%s rocket gathered next crystals: %s, total crystals in wizard: %s, got winner - %s\n",
                        wizard.getName(), gatheredCrystalsFromPlanet,
                        wizard.totalCrystals(), ThreadUtil.gotWinner);
            } else if (planet.getCrystals().isEmpty()){
                System.out.printf("%s rocket gone with nothing", wizard.getName());
            }
            return gatheredCrystalsFromPlanet;
        }
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public Wizard getWizard (){
        return wizard;
    }
}