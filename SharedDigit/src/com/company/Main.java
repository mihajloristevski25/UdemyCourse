package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int number1 , int number2){
        if(((number1 > 99) || (number1 < 10)) || ((number2 > 99) || (number2 < 10)))
            return false;

            int firstDigit1 = number1 / 10;
            int lastDigit1 = number1 % 10;
            int firstDigit2 = number2 / 10;
            int lastDigit2 = number2 % 10;
        if((firstDigit1 == firstDigit2) || (lastDigit1 == lastDigit2))
                return true;
        else if((lastDigit2 == firstDigit1) || (firstDigit2 == lastDigit1)){
            return true;
        }
        else
            return false;
    }
}
