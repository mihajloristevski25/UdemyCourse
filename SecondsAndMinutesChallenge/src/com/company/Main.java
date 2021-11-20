package com.company;

import java.util.zip.CheckedOutputStream;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(36460,56));
        System.out.println(getDurationString(3650));
        System.out.println(getDurationString(-54));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(int minutes , int seconds){

        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
           int  hours = minutes / 60;
           int remainingMinutes =  minutes %= 60;
           String hoursString = hours + "h";
           if(hours < 10){
               hoursString = "0"+hoursString;
           }
           String minutesString = minutes + "m";
            if(minutes < 10){
            minutesString = "0"+minutesString;
            }
            String secondsString = seconds + "s";
            if(seconds < 10){
            secondsString = "0"+secondsString;
            }
           
                return hoursString + " " + minutesString + " " + secondsString;
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
