package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000.0,2.0));
//        System.out.println(calculateInterest(10000.0,3.0));
//        System.out.println(calculateInterest(10000.0,4.0));
//        System.out.println(calculateInterest(10000.0,5.0));
//
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Loop " + i + " hello!");
        }
            System.out.println();
        for(int i = 1 ; i < 6 ; i++){
            System.out.println("Loop " + i + " hello!");
        }
            System.out.println();
        for(int i = 2 ; i < 9 ;i++){
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println();
        for(int i = 8 ; i > 1 ;i--){
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }

    }

    public static double calculateInterest(double amount , double interestRate){
        return (amount * (interestRate/100));
    }
}
