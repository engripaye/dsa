package org.engripaye.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // TODO  Find two numbers in an array that sum to a target. (HashMap approach for O(N) solution)

    public static int[] twoSums(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>(); // store numbers

        for(int i=0; i< nums.length; i++) {
            int complement = target - nums[i]; // number we need to find
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; // found their pair
            }
            map.put(nums[i], i); // store their number and its index
        }

        return new int[]{}; // return empty array if no solution


    }




    public static void main(String[] args) {

        int[] nums = {2, 4, 7, 10, 12};
        int target = 22;

        System.out.println(Arrays.toString(twoSums(nums, target)));
    }


}
