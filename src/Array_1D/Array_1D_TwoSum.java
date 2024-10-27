
import java.util.Arrays;
import java.util.Scanner;

public class Array_1D_TwoSum {
    public static void main(String[] args) {
        // Two Sum Leetcode#1
        // Input : nums = { 2,7,11,15}, target = 9
        // Output : [0,1]
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        /*
         * Given an array of integers nums and an integer target,
         * return indices of the two numbers such that they add up to target.
         * You may assume that each input would have exactly one solution,
         * and you may not use the same element twice.
         */

        int[] ans = func(nums, target);
        // print ans
        System.out.println(Arrays.toString(ans));

    }

    public static int[] func(int[] nums, int target) {
        // Using two Pointer
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        // If no solution is found (just in case)
        return new int[] {};
    }
}
