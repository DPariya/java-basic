package Beginner.Array_1D;

import java.util.Arrays;

public class Array_1D_2Concatenation {
    public static void main(String[] args) {
        /*
         * Given an integer array nums of length n, you want to create an array ans of
         * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
         * (0-indexed).
         * 
         * Specifically, ans is the concatenation of two nums arrays.
         * 
         * Return the array ans.
         * Input 1: nums = [1,2,1]
         * Output 1: [1,2,1,1,2,1]
         */

        int[] num = { 1, 2, 1 };
        int n = num.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = num[i];
        }

        // print ans
        System.out.println(Arrays.toString(ans));

    }
}
