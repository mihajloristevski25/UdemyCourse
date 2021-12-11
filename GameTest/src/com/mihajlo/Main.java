package com.mihajlo;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player mihajlo = new Player("Mihajlo" , 10 ,15);
        System.out.println(mihajlo.toString());
        saveObject(mihajlo);

        mihajlo.setHitPoints(8);
        System.out.println(mihajlo);
        mihajlo.setWeapon("Shadowmourne");
        saveObject(mihajlo);
      //  loadObject(mihajlo);
        System.out.println(mihajlo);

        ISaveable werewolf = new Monster("Werewolf", 20 , 50);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){
            System.out.println("Chose Option:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave){
        for(int i = 0 ; i < objectToSave.write().size() ; i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
