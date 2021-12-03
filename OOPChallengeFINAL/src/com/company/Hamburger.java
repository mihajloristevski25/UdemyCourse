package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat,double price , String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a "+ breadRollType + " roll with " + meat + ", price is "+price);
    }

    public void addHamburgerAddition1(String name , double price){
        System.out.println("Added "+ name + " for an extra " + price);
        this.price += price;
    }
    public void addHamburgerAddition2(String name , double price){
        System.out.println("Added "+ name + " for an extra " + price);
        this.price += price;
    }
    public void addHamburgerAddition3(String name , double price){
        System.out.println("Added "+ name + " for an extra " + price);
        this.price += price;
    }
    public void addHamburgerAddition4(String name , double price){
        System.out.println("Added "+ name + " for an extra " + price);
        this.price += price;
    }
    public double itemizeHamburger(){
        return this.price;
    }

}
