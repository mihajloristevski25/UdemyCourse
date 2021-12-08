package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+389 78 566 565");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }

    }


    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number ");
        String phone = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name , phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added :" + name + ", phone = " + phone);
        } else {
            System.out.println("cannot add, " + name + " already on file.");
        }
    }

    public static  void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord =  mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found. ");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("New mobile phone number:");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName , newNumber);
        if(mobilePhone.updateContact(existingContactRecord , newContact)){
            System.out.println("Succesfully updated record");
        }else{
            System.out.println("error updating record.");
        }
    }

    public static  void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found. ");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord))
            System.out.println("Successfully deleted");
        else
            System.out.println("Error deleting contact");
    }

    public static  void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found. ");
            return;
        }

        System.out.println("Name: "+ existingContactRecord.getName() + " phone number is "+ existingContactRecord.getPhoneNumber());
    }


    private static void startPhone(){
        System.out.println("Starting phone");
    }
    private static void printActions(){
        System.out.println("\n Available actions: \npress" +
            "0 - to shutdown \n "+
            "1 - to print contacts \n "+
            "2 - to add a new contact \n "+
            "3 - to update \n "+
            "4 - to remove a contact \n "+
            "5 - query if an existing contact exists \n "+
            "6 - to print a list of available actions. \n "+
        "Chose your action \n ");
    }
}
