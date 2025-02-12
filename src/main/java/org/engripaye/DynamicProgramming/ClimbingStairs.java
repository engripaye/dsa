package org.engripaye.DynamicProgramming;

public class ClimbingStairs {

    // you care climbing a staircase you can take one or two stairs at a time how many different ways can you reach your destination

    public static int climbStairs(int n) {
        if (n <= 2 ) return n;

        int first = 1, second = 2;

        for (int i = 3; i <= n; i ++ ){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
