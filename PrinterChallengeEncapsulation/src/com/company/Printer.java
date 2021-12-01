package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean duplex;

    public Printer(int tonerLever,  boolean duplex) {
        if (tonerLever >= 0 && tonerLever <= 100){
            this.tonerLevel = tonerLever;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public void printingPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            this.numberOfPages += pagesToPrint;
            System.out.println("Printing in duplex mode pages printed "+ this.numberOfPages);
        } else {
            this.numberOfPages += pages;
            System.out.println("Pages printed = " + this.numberOfPages);
        }
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

}
