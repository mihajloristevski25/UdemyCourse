package com.company;

public class Main {

    public static void main(String[] args) {
	    double  firstDouble = 20.00d;
        double  secondDouble = 80.00d;
        double total = (firstDouble + secondDouble) * 100.00d;
        System.out.println("My value total is " + total);
        double remainder = total % 40.00d;
        System.out.println("Remainder is equal to " + remainder);
        boolean isTrue = (remainder == 0) ? true : false;
        System.out.println(isTrue);
        if(!isTrue){
            System.out.println("Got some remainder");
        }
    }
}
