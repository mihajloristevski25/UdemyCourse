package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString ="2018";
        System.out.println("numberAsStrings = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double numberd = Double.parseDouble(numberAsString);
        number += 1;

        System.out.println("number = " + number);
        System.out.println("numberd = " + numberd);
    }
}
