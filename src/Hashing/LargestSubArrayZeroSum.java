package Hashing;

import java.util.HashMap;

public class LargestSubArrayZeroSum {
    /*
     * Given an array arr[] of length N, find the length of the longest sub-array
     * with a sum equal to 0.
     * 
     * Input : arr[] = {15, -2, 2, -8, 1, 7, 10, 23}
     * Output 1: 5
     * 
     */
    public static void main(String[] args) {

        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        int ans = 0, rnSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            rnSum += arr[i];
            // If rnSum == 0, it means the entire subarray from index 0 to i has sum 0,
            // Without it, we might miss a valid zero-sum subarray, leading to incorrect
            // results, otherwise, it might cause a NullPointerException if rnSum was never
            // stored in the HashMap
            if (rnSum == 0) {
                ans = Math.max(ans, i + 1);
            }

            if (hm.containsKey(rnSum)) {
                ans = Math.max(ans, i - hm.get(rnSum));

            } else {
                hm.put(rnSum, i);
            }

        }
        System.out.println(ans);

    }

}
