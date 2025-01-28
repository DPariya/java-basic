package Sorting;

import java.util.Arrays;

public class SelectionSort {
    /*
     * Time Complexity:
     * Best, Average, and Worst Case: O(n²), where n is the number of elements. This
     * is because the algorithm involves two nested loops — one for iterating over
     * each element (i) and another for comparing with the remaining elements (j).
     * Space Complexity:
     * O(1): Selection sort is an in-place sorting algorithm, so it doesn't require
     * any extra space beyond the input array.
     */
    public static void main(String[] args) {

        int[] arr = { 10, 1, 2, 3, 4, 5 };
        int num = arr.length;
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[minIndex]) {
                    System.out.println("minVal -- " + j);
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.println("Optimized Way = " + Arrays.toString(arr));

    }

}
