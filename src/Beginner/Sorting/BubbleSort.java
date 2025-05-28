package Beginner.Sorting;

import java.util.Arrays;

public class BubbleSort {
    /*
     * TC : Best Case (already sorted array): O(n)
     * TC : Average and Worst Case: O(n²), (array in reverse order),perform n(n-1)/2
     * comparisons and swaps
     */
    public static void main(String[] args) {

        int[] arr = { 3, 1, 2, 9, 7, 5 };
        int n = arr.length;
        // this is traditional bubble sort
        for (int round = 1; round < n - 1; round++) {
            for (int i = 0; i <= n - round - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        System.out.println("Normal way -- " + Arrays.toString(arr));
        /*
         * This implementation of Bubble Sort is optimized with an early exit if the
         * array becomes sorted before completing all the passes. This can help improve
         * performance when the array is already or nearly sorted.
         */
        // optimized bubble sort for almost/nearly sorted array
        int[] arr2 = { 10, 1, 2, 3, 4, 5 };
        int num = arr2.length;
        for (int i = 0; i < num - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < num - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    swap(arr2, j, j + 1);
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println("Optimized Way = " + Arrays.toString(arr2));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
