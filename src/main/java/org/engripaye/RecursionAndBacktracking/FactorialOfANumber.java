package org.engripaye.RecursionAndBacktracking;

public class FactorialOfANumber {

    // example 5! -> 5*4*3*2*1 // 5(5-1)!

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1; // base case

        return n * factorial(n-1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
