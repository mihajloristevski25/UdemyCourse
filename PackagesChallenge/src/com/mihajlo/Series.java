package com.mihajlo;

public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        int factorial = 1;
        for(int i = 0 ; i <= n ; i++){
            factorial *= i+1;
        }
        return factorial;
    }

    public static int fibonacci(int n) {
            if (n <= 1)
                return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
}
