package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println(printer.getNumberOfPages());
        printer.printingPages(20);
        printer.printingPages(20);
    }
}
