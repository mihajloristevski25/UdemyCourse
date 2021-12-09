package com.company;

public class Pinguin extends Bird {
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that can we go swimming");
    }
}
