package com.company;

public class Lamp {
    private int size;
    private String model;

    public Lamp(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void isLampOn(boolean test){
        if(test){
            System.out.println("The lamp in the room is on");
        }else {
            System.out.println("The lamp in the room is off");
        }
    }
}
