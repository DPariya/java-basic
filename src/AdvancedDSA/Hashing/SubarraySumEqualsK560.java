package AdvancedDSA.Hashing;

import java.util.HashMap;

public class SubarraySumEqualsK560 {
    /*
     * Given an array of integers nums and an integer k, return the total number of
     * subarrays whose sum equals to k.
     * 
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        // initialism map
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);

    }

}
