package Beginner.Sorting;

import java.util.Arrays;

public class MinDifference {
    /*
     * Given an unsorted array, find the minimum difference between any pair in
     * given array.
     * 
     * Input 1: nums = [2, 4, 5, 9, 7]
     * Output 1: 1
     * Explanation 1: Difference between 5 and 4 is 1.
     * 
     */
    public static void main(String[] args) {

        int[] input = { 2, 4, 5, 9, 7 };
        Arrays.sort(input);
        int n = input.length, minDiff = input[1] - input[0];
        for (int i = 2; i < n; i++) {

            if (input[i] - input[i - 1] < minDiff) {
                minDiff = input[i] - input[i - 1];
            }
        }

        System.out.println("minimum difference between any pair " + minDiff);

    }

}
