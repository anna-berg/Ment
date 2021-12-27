package com.berg.homework1121.ATM;

public class Bill {

    private int bill;
    private int count;

    public Bill(int bill, int count) {
        this.bill = bill;
        this.count = count;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" +
                "купюры по " + bill +
                " : " + count +
                '}';
    }
}
