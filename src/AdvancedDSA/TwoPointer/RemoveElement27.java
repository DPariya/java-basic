package AdvancedDSA.TwoPointer;

import java.util.ArrayList;

public class RemoveElement27 {
    /*
     * Given an integer array nums and an integer val, remove all occurrences of val
     * in nums in-place. The order of the elements may be changed. Then return the
     * number of elements in nums which are not equal to val.
     * 
     * Consider the number of elements in nums which are not equal to val be k, to
     * get accepted, you need to do the following things:
     * 
     * Change the array nums such that the first k elements of nums contain the
     * elements which are not equal to val. The remaining elements of nums are not
     * important as well as the size of nums.
     * Return k.
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     */
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

        int val = 2;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);

    }

}
