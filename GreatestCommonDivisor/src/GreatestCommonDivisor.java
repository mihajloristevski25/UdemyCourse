public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first , int second){
        if(first < 10 || second < 10) {
            return -1;
        }
        int div = 0;
        for(int i = 1 ; i <= second ; i++){
            if(first % i == 0 && second % i == 0)
                div = i;
        }
        return div;
    }
}
