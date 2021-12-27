package com.berg.homework1121.ATM;

import java.util.Arrays;

public class AtmRunner {

    public static void main(String[] args) {
        Atm3 atm = new Atm3(new Bill[]{
                new Bill(100, 2),
                new Bill(50, 10),
                new Bill(20, 10)
        });

        System.out.println("В банкомате сейчас: " + Arrays.toString(atm.getBillsInAtm()));
        System.out.println();
        int withdrawAmount = 410;
        boolean withdraw = atm.withdraw(withdrawAmount);
        System.out.println("Сумма к снятию: " + withdrawAmount);
        if (withdraw) {
            System.out.println("Получение: " + Arrays.toString(atm.getResult()));
        } else {
            System.out.println("Can't withdraw " + withdrawAmount);
        }
        System.out.println("В банкомате сейчас: " + Arrays.toString(atm.getBillsInAtm()));
    }
}
