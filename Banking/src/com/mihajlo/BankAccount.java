package com.mihajlo;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    // Branch is true if the cutomer is perfoming the transaction
    // at a branch, with a teller
    // It's a false if the customer is performing the transaction at the atm
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    // Branch is true if the cutomer is perfoming the transaction
    // at a branch, with a teller
    // It's a false if the customer is performing the transaction at the atm
    public double withdraw(double amount, boolean branch){
        if((amount > 500) && (!branch)){
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }
    // More methods that use firstName lastName and other functions
}
