package org.engripaye.TwoPointers;

public class MoveZeros {

        public static void moveZeros(int[] nums) {
            int index = 0; // pointer for the next non-zero position

            // move non-zero numbers forward
            for(int num : nums ) {
                if(num != 0) {
                    nums[index] = num;
                    index++;
                }
            }

            // fill the remaining places with zeros
            while (index < nums.length) {

                nums[index] = 0;
                index++;

            }
        }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 3, 12};
        moveZeros(nums);

        System.out.println(java.util.Arrays.toString(nums));
    }


}
