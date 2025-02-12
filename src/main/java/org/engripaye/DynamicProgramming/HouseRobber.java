package org.engripaye.DynamicProgramming;

public class HouseRobber {

    // -- you are planning to rob houses on the street,
    // but you can't rob houses close to each other, else the alarm will go off
    // rob house 1, skip 2, rob 3, skip 4, etc.
    public static int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev1 = 0, prev2= 0;

        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + num);

            prev2 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int [] houses = {2, 7, 9, 3, 1};
        System.out.println(rob(houses));
    }
}
