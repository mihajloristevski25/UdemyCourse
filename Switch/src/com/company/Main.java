package com.company;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("was not 1 or 2");
//        }


        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 , 4 ,5");
                System.out.println("Actually was "+switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
        }

        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("Its A");
                break;
            case 'B':
                System.out.println("Its B");
                break;
            case 'C':
                System.out.println("Its C");
                break;
            case 'D':
                System.out.println("Its D");
                break;
            case 'E':
                System.out.println("Its E");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
