public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = 0;
        while(number > 0){
            int digit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + digit;
        }



    }
    public static int reverse(int number){
        int reversedNumber = 0;
        while(Math.abs(number) > 0){
            int digit = number % 10;
            number = number / 10;
            reversedNumber = (reversedNumber * 10) + digit;
        }
        return  reversedNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0){
            return -1;
        }
        int counter = 0;
        while(number > 0)
        {
            number = number/10;
            counter++;
        }
        return counter;
    }
}
