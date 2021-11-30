package com.company;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1234 , 2 , "Default name" , "Default address" , "Default phone");
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accountNumber , int balance , String customerName , String email , String phoneNumber){
        System.out.println("account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int funds){
        this.balance = this.balance + funds;
        System.out.println("Deposit of " + funds + " made. New Balance is " + this.balance);
    }
    public void withdrawFunds(int funds){
        if(this.balance - funds < 0)
            System.out.println("Insufficient funds you have " + this.balance + " you want to withdraw " + funds);
        else
            this.balance -= funds;
            System.out.println("withdrawl of " + funds + " sucessful remaining amout is " + this.balance);
    }
}
