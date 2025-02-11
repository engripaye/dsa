package org.engripaye.SearchingAndSorting;

public class BinarySearch {

    // search for an object or a number by diving search space by 2, making it super fast

    public static int search(int [] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2; // Middle index by search

            if(nums[mid] == target) {
                return mid; // found it
            }
            else if (nums[mid] < target) {
                left = mid + 1; // search the right half
            }
            else {
                right = mid - 1; // search the left half
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 7, 9, 11};
        System.out.println(search(nums, 5)); // output 2
        System.out.println(search(nums, 8));// output -1 not found
        System.out.println(search(nums, 9)); // output 4
    }
}
