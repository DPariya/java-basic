package Beginner.Hashing;

import java.util.HashMap;
import java.util.HashSet;

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
        if (n <= 1) {
            System.out.println("true");
            return;
        }
        /*
         * Integer.MIN_VALUE is the smallest possible integer in Java (-2^31 or
         * -2147483648).
         * When finding the maximum element, we start with the smallest possible value.
         * As we iterate through the array, every number greater than max updates max.
         * So, same for min value = Integer.MAX_VALUE
         */
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Find min and max elements
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate common difference
        if ((max - min) % (n - 1) != 0) {
            System.out.println("false");
            return;
        } // If d is not an integer, AP is not possible
        int d = (max - min) / (n - 1);

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Check if all expected terms are in the set
        for (int i = 0; i < n; i++) {
            int term = min + i * d;
            if (!set.contains(term)) {
                System.out.println("false");
                return;
            } // Missing term means it's not an AP
        }

        System.out.println("true");

    }

}
