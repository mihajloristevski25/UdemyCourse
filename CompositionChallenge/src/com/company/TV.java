package com.company;

public class TV {
    public Resolution resolution;
    public String model;

    public TV(Resolution resolution, String model) {
        this.resolution = resolution;
        this.model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getModel() {
        return model;
    }
    public void turnOn(){
        System.out.println("The tv is turned on");
    }
    public void setChannel(int channelNumber){
        System.out.println("The TV is set to channelNumber "+ channelNumber);
    }
}
