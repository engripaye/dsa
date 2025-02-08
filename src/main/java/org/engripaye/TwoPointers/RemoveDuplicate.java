package org.engripaye.TwoPointers;

public class RemoveDuplicate {

    // Remove duplicates numbers from sorted array

    public static int removeDuplicate(int[] nums) {

        if(nums.length == 0) return 0; // edge case: empty array

        int index = 1; // pointer for the next unique position

        for(int i = 1; i< nums.length; i++) {
            if(nums[i] != nums[i - 1]) { // if new unique number found

                nums[index] = nums[i]; // move it to the correct position

                index ++; // move unique index forward
            }
        }
        return index; // the new length of unique numbers
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int length = removeDuplicate(nums);
        System.out.println(STR."New length: \{length}");
    }
}
