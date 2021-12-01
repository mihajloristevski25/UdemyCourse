package com.company;

public class Room {
    private String name;
    private Dimensions dimensions;
    private Lamp lamp;
    private TV tv;
    private Desk desk;

    public Room(String name , Dimensions dimensions, Lamp lamp, TV tv, Desk desk) {
        this.name = name;
        this.dimensions = dimensions;
        this.lamp = lamp;
        this.tv = tv;
        this.desk = desk;
    }


    public void isLampOn(boolean test){
        lamp.isLampOn(test);
    }
    public void turnOnTV(){
        tv.turnOn();
    }
    public void setChannel(int channel){
        tv.setChannel(channel);
    }
}
