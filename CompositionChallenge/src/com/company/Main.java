package com.company;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(10,10,5);
        Lamp lamp = new Lamp(1,"lampModel");
        Resolution tvResolution = new Resolution(5200,3500);
        TV tv = new TV(tvResolution,"SAMSUNG");
        Desk desk = new Desk(20,"TV Desk");

        Room room = new Room("Living Room",dimensions,lamp,tv,desk);
        room.isLampOn(false);
        room.turnOnTV();
        room.setChannel(29);
    }
}
