package com.mihajlo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }
    // sinkroniziranje na metodite so koristenje na synchronized vo deklariranjeto
//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }

    // sinkroniziranje na metodite vnatreshno
//    public void deposit(double amount) {
//        synchronized (this){
//            balance += amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        synchronized (this) {
//            balance -= amount;
//        }
//    }

    // koristenje na reentrant lock
//    public void deposit(double amount) {
//        lock.lock();
//        try {
//            balance += amount;
//        }finally {
//            lock.unlock();
//        }
//
//
//    }
//
//    public void withdraw(double amount) {
//        lock.lock();
//        try {
//            balance -= amount;
//        }finally {
//            lock.unlock();
//        }
//    }
//

    public void deposit(double amount) {

        boolean status = false;

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Couldn't get the lock");
            }
        }catch (InterruptedException e){
            //do something here
        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance -= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Couldn't get the lock");
            }
        }catch (InterruptedException e){
            // do something here
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}