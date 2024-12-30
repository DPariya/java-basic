public class MaximumOfAbsolute1131 {
    public static void main(String[] args) {
        // Two Sum Leetcode#1131
        // Input : arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
        // Output : 13
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { -1, 4, 5, 6 };
        // prettier-ignore
        /*
         * Given two arrays of integers with equal lengths, return the maximum value of:
         * compute|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
         * where the maximum is taken over all 0 <= i, j < arr1.length
         */

        /**
         * 
         * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
         * + + +
         * + + -
         * + - +
         * + - -
         * - + +
         * - + -
         * - - +
         * - - -
         * 
         * Case 1: (arr1[i] + arr2[i] + i) - (arr1[j] + arr2[j] + j)
         * Case 2: (arr1[i] + arr2[i] - i) - (arr1[j] + arr2[j] - j)
         * Case 3: (arr1[i] - arr2[i] + i) - (arr1[j] - arr2[j] + j)
         * Case 4: (arr1[i] - arr2[i] - i) - (arr1[j] - arr2[j] - j)
         * Case 5: -(arr1[i] - arr2[i] - i) + (arr1[j] - arr2[j] - j)
         * Case 6: -(arr1[i] - arr2[i] + i) + (arr1[j] - arr2[j] + j)
         * Case 7: -(arr1[i] + arr2[i] - i) + (arr1[j] + arr2[j] - j)
         * Case 8: -(arr1[i] + arr2[i] + i) + (arr1[j] + arr2[j] + j)
         * 
         * - (arr1[i] + arr2[i] + i) + (arr1[j] + arr2[j] + j)
         * 
         * Case 1 and 8 => Same
         * Case 2 and 7 => Same
         * Case 3 and 6 => Same
         * Case 4 and 5 => Same
         * 
         * arr1 = [1,2,3,4],
         * arr2 = [-1,4,5,6]
         * k 0, 1,2,3 // index
         * 1 -> [0,7,10,13]
         * 
         * arr1[k] + arr2[k] + k => max - min
         * arr1[k] + arr2[k] - k => max - min
         * arr1[k] - arr2[k] + k => max - min
         * arr1[k] - arr2[k] - k => max - min
         * 
         * Case 1 -> (arr1[i] + arr2[i] + i) - (arr1[j] + arr2[j] + j)
         * Case 8 -> (arr1[j] + arr2[j] + j) - (arr1[i] + arr2[i] + i)
         */

        // -----coding
        int n = arr1.length;

        //take four arr that will calculate the four different cases
        int[] first = new int[n];
        int[] second = new int[n];
        int[] third = new int[n];
        int[] fourth = new int[n];

        for(int i =0;i<n;i++){
            first[i] = arr1[i] + arr2[i] + i;
            second[i] = arr1[i] + arr2[i] - i;
            third[i] = arr1[i] - arr2[i] + i;
            fourth[i] = arr1[i] - arr2[i] - i;
        }

        int ans = Math.max(Math.max(fun(first,n),fun(second,n)),Math.max(fun(third,n),fun(fourth,n)));
        // print ans
        System.out.println(ans);

    }

    static int fun(int[] arr, int n) {
        int maxSum = arr[0];
        int minSum = arr[0];

        // find the min and max from arr
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, arr[i]);
            minSum = Math.min(minSum, arr[i]);
        }
        return (maxSum - minSum);
    }
}
