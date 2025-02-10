package org.engripaye.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    // numbers that occurs twice in different set of array

    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>(); // store unique number from first list

        Set<Integer> resultSet = new HashSet<>(); // store common numbers

        for(int num : nums1) set1.add(num); // put all the numbers from first list into a set

        for(int num : nums2) {
            if(set1.contains(num)) resultSet.add(num); // if in both list, add to result
        }

        return resultSet.stream().mapToInt(i -> i).toArray(); // convert result set to Array
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 2, 3, 4};
        int[] nums2 = {1, 9, 7, 3};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

}
