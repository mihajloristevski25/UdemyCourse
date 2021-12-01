package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "DELL","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast" , "Acer", 27,new Resolution(1900,1800));
        Motherboard theMotherboard = new Motherboard("BJ-200" , "ASSUS",4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor , theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}
