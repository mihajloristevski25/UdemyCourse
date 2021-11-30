package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int counter = 0;

        int sum = 0;
            while (true) {
                int order = counter + 1;
                System.out.println("Enter number #" +order);

                boolean hasNextInt = sc.hasNextInt();

                if(hasNextInt) {
                    int number = sc.nextInt();
                    counter++;
                    sum += number;
                    if (counter == 10)
                        break;
                } else {
                    System.out.println("You entered a invalid input on number " + order);
                }
                sc.nextLine();
            }
            System.out.println("sum of 10 numbers is: " + sum);
        sc.close();
    }
}
