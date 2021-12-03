package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic" , "Sausage" , 3.56 , "White");
        hamburger.addHamburgerAddition1("Tomato" , 0.27);
        hamburger.addHamburgerAddition2("Lettuce" , 0.75);
        hamburger.addHamburgerAddition3("Cheese" , 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println();

        HealthyBurger hb = new HealthyBurger("Bacon" , 5.67);
        hb.addHamburgerAddition1("Egg" , 5.43);
        hb.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is " + hb.itemizeHamburger());

        System.out.println();

        DeluxeBurger db = new DeluxeBurger();
        String strDouble = String.format("%.2f", db.itemizeHamburger());
        System.out.println("Total Deluxe Burger price is " + strDouble);

    }
}
