package com.berg.homework1226.practice.account;

public class Account {

    private  int id;
    private static int generator = 1;
    private int money;

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }

    public void add(int money){
        this.money += money;
    }

    public boolean takeOff(int money){
        if(this.money >= money){
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
