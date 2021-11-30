package com.company;

public class Main {

    public static void main(String[] args) {
	    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("Mihajlo" , "mihajlo123@gmail.com");
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("Mihajlo" , 100.0 , "mihajlo123@gmail.com");
        System.out.println(person3.getEmailAddress());
    }
}
