public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int testNumber = Math.abs(number);
        while(testNumber > 0){
            int digit = testNumber % 10;
            testNumber = testNumber / 10;
            reverse = (reverse * 10) + digit;
        }
        if(reverse == Math.abs(number))
            return true;
        else
            return false;
    }
}
