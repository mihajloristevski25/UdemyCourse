package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true){

            System.out.println("Enter number:");

            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int number = scanner.nextInt();
                if(number > max)
                    max = number;
                if(number < min)
                    min = number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("max = " + max + " min = " + min);
        scanner.close();
    }
}
