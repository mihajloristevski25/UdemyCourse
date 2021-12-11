package com.mihajlo;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        //System.out.println(Math.PI);
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(5423432);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        SIB test = new SIB();
        test.someMethod();
        System.out.println("Owner is " + SIB.owner);
    }

}
