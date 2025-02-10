package org.engripaye.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    // numbers that occur more than once in an array

    public static  boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 4, 7, 2};

        System.out.println(containsDuplicate(nums));
    }
}
