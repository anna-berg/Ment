package com.berg.homework1226.homework;

import com.berg.homework1226.homework.model.Wizard;
import com.berg.homework1226.homework.thread.Night;
import com.berg.homework1226.homework.thread.Planet;
import com.berg.homework1226.homework.thread.Rocket;
import com.berg.homework1226.homework.util.ThreadUtil;

public class WizardDemo {

    public static void main(String[] args) throws InterruptedException {
        Night night = new Night();
        Planet planet = new Planet(night);
        Rocket rocketFire = new Rocket(night,new Wizard("Fire Wizard"), planet);
        Rocket rocketAir = new Rocket(night,new Wizard("Air Wizard"), planet);

        ThreadUtil.startThreads(night, planet, rocketAir, rocketFire);
        ThreadUtil.joinThreads(night, planet, rocketAir, rocketFire);

        viewStatistic(rocketAir.getWizard(), rocketFire.getWizard());
    }

    private static void viewStatistic (Wizard firstWizard, Wizard secondWizard){
        System.out.println("----------------");
        System.out.println(firstWizard.getName() + " " + firstWizard.getCrystals() + " total: " + firstWizard.totalCrystals() + " " + ThreadUtil.gotWinner);
        System.out.println(secondWizard.getName() + " " + secondWizard.getCrystals() + " total: " + secondWizard.totalCrystals() + " " + ThreadUtil.gotWinner);
    }
}
