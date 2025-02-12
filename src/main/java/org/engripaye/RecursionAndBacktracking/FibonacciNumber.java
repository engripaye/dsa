package org.engripaye.RecursionAndBacktracking;

public class FibonacciNumber {

    // the first two numbers are 0 and 1 then the next number
    // is sum of the two numbers before it

    // 0 -> 1 -> 1(0+1) -> 2 (1+1)

    public static int fibonacci(int n) {
        if(n==0) return 0; // base case
        if(n==1) return 1; // base case

        return fibonacci(n-1) + fibonacci(n-2); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
    }
}
