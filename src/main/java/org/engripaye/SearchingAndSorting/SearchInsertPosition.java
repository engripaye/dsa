package org.engripaye.SearchingAndSorting;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found it
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return left; // this is where the target should be inserted
    }

    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5)); // output 2

        System.out.println(searchInsert(nums, 2)); // output 1

        System.out.println(searchInsert(nums, 7)); // output 4

        System.out.println(searchInsert(nums, 0)); // output 0
    }
}
