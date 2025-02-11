package org.engripaye.SearchingAndSorting;

import java.util.Arrays;

public class MergeSortedArrays {


    // compilation of different arrays from numbers from smallest to biggest

    public static int[] merge(int[] nums1, int[] num2) {
        int n = nums1.length, m = num2.length;

        int [] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] < num2[j]) {
                result[k++] = nums1[i++]; // take from nums 1
            }else {
                result[k++] = num2[j++]; // take from nums 2
            }
        }
        while (i < n) result[k++] = nums1[i++]; // add leftovers from nums 1
        while (j < m) result[k++] = num2[j++]; // add leftovers from nums 2

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        System.out.println(Arrays.toString(merge(nums1, nums2)));
    }
}
