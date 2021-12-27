package com.berg.homework1226.practice.account;

public class AccountThread extends Thread{

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        synchronized (accountFrom){
            synchronized (accountTo){
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + " in FOR " + i);
                    if(accountFrom.takeOff(10)){
                        System.out.println("taking off 10 from " + accountFrom + Thread.currentThread().getName());
                        accountTo.add(10);
                        System.out.println("adding 10 to " + accountTo + Thread.currentThread().getName());
                    }
                }
            }
        }
    }
}
