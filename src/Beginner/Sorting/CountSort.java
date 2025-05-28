package Beginner.Sorting;

public class CountSort {
    /*
     * If the range of numbers is known to be small, counting sort is very efficient
     * in terms of time complexity (O(n + k), where n is the number of elements and
     * k is the range of values).
     * However, if there are a large number of unique values (high max), the space
     * complexity of the frequency array could become a concern.
     */
    public static void main(String[] args) {

        int[] arr = { 10, 1, 2, 3, 4, 5 };
        int num = arr.length;
        // find max first
        int max = arr[0];
        for (int i = 1; i < num; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // initialize frequency array size of max+1
        int freq[] = new int[max + 1];

        // fill the freq array with 1, at each index, which are elements in arr
        for (int i = 0; i < num; i++) {
            freq[arr[i]]++;

        }
        // print arr in sorted way
        for (int i = 0; i <= max; i++) {
            while (freq[i]-- > 0) {
                System.out.print(i + " ");
            }
        }
        // System.out.println("Optimized Way = " + Arrays.toString(arr));

    }

}
