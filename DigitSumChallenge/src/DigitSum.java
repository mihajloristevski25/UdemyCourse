public class DigitSum {
    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10){
            return -1;
        }
            while(number > 0){
                int digit = number % 10;
                number = number / 10;
                sum += digit;
            }
        return sum;
    }

}
