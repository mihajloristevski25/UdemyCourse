package com.mihajlo;

public class Main {

    public static void main(String[] args) {
        Account mihajloAccount = new Account("Mihajlo");
        mihajloAccount.deposit(1000);
        mihajloAccount.withdraw(500);
        mihajloAccount.withdraw(-200);
        mihajloAccount.deposit( -20);
        mihajloAccount.calculateBalance();


        System.out.println("Balance on account is "+ mihajloAccount.getBalance());
        mihajloAccount.calculateBalance();
    }
}
