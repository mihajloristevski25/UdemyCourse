package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = readInteger();
       int[] array =  readElements(number);
        System.out.println("min value is " + findMin(array));
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
           for(int i = 0 ; i < array.length; i++){
                if(array[i] < min)
                    min = array[i];
           }
           return min;
       }
}
