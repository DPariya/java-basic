package Sorting;

import java.util.Arrays;

public class BinaryArraySorting {
    /*
     * Given a binary array A[] of size N. The task is to arrange the array in
     * increasing order.
     * 
     * Note: The binary array contains only 0 and 1.
     * 
     * Input 1: arr[] = {1, 0, 1, 1, 0}
     * Output 1: 0 0 1 1 1
     * 
     */
    public static void main(String[] args) {

        int[] input = { 1, 0, 1, 1, 0 };
        int n = input.length, zeroes = 0;
        for (int x : input) {
            if (x == 0) {
                zeroes++;
            }
        }
        int[] ans = new int[n];
        for (int i = zeroes; i < n; i++) {
            ans[i] = 1;
        }

        System.out.println("Sorted Binary Array " + Arrays.toString(ans));

    }

}
