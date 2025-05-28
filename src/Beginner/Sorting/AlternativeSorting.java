package Beginner.Sorting;

import java.util.Arrays;

public class AlternativeSorting {
    /*
     * Given an array arr[] of N distinct integers, output the array in such a way
     * that the first element is first maximum and the second element is the first
     * minimum, and so on.
     * 
     * Input 1: N = 7, arr[] = {7, 1, 2, 3, 4, 5, 6}
     * Output 1: 7 1 6 2 5 3 4
     */
    public static void main(String[] args) {

        int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        // first sort arr
        Arrays.sort(arr);
        int l = 0, r = n - 1, i = 0;
        int[] ans = new int[n];
        // print arr in sorted way
        while (l < r) {
            ans[i] = arr[r];
            i += 1;
            ans[i] = arr[l];
            i += 1;
            l += 1;
            r -= 1;
        }
        if (n % 2 == 1) {
            ans[i] = arr[n / 2];
        }
        System.out.println("Optimized Way = " + Arrays.toString(ans));

    }

}
