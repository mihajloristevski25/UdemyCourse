package com.company;

public class HealthyBurger extends Hamburger{

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name , double price){
        super.addHamburgerAddition3(name,price);
    }
    public void addHealthyAddition2(String name , double price){
        super.addHamburgerAddition4(name,price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
