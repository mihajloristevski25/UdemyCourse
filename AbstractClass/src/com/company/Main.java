package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Pitbull");
        dog.eat();
        dog.breathe();
        Parroy parrot = new Parroy("parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Pinguin pinguin = new Pinguin("Penguin");
        pinguin.fly();
    }
}
