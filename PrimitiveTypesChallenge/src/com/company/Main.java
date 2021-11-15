package com.company;

public class Main {

    public static void main(String[] args) {
        byte challengeByteNumber = 120;
        short challengeShortNumber = 2000;
        int challengeIntNumber = 32000;
        long challengeTotal = 50000 + 10 * (challengeByteNumber+challengeIntNumber+challengeShortNumber);
        System.out.println(challengeTotal);

        short shortTotal = (short) (1000 + 10 *
                (challengeByteNumber + challengeShortNumber + challengeIntNumber));
    }
}
