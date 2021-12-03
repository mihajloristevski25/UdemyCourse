package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 5 random numbers to get the sorted");
        int[] array = getIntegers(5);
        System.out.println("Normal array");
        printArray(array);
        System.out.println("Sorted array");
        printArray(sortArray(array));

    }
    public static int[] getIntegers(int number){
        int[] array = new int[number];
        for(int i = 0 ; i < array.length ; i ++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i = 0 ; i < array.length;i++){
            System.out.println("At index "+ i +" is number " +array[i]);
        }
    }
    public static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0 ; i < sortedArray.length-1 ; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
