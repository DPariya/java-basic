package AdvancedDSA.TwoPointer;

import java.util.Arrays;

public class KDiffPairsArray532 {
    /*
     * Given an array of integers nums and an integer k, return the number of unique
     * k-diff pairs in the array.
     * 
     * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are
     * true:
     * 
     * ->0 <= i, j < nums.length
     * ->i != j
     * ->|nums[i] - nums[j]| == k
     * 
     * Notice that |val| denotes the absolute value of val.
     * 
     * Input: nums = [3,1,4,1,5], k = 2
     * Output: 2
     * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
     * Although we have two 1s in the input, we should only return the number of
     * unique pairs.
     */
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5 };
        int k = 2;
        int n = nums.length;
        int count = 0, l = 0, r = 1;
        Arrays.sort(nums);
        while (r < n) {
            if (l == r || nums[r] - nums[l] < k) {
                r++;
            } else if (nums[r] - nums[l] > k) {
                l++;
            } else {
                count++;
                l++;
                r++;
                // skip duplicate right
                while (r < n && nums[r] == nums[r - 1]) {
                    r++;
                }
            }
        }

        System.out.println("Count " + count);

    }

}
