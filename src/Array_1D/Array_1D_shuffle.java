import java.util.Arrays;

public class Array_1D_shuffle {
    public static void main(String[] args) {
        /*
         * Given the array nums consisting of n(n will be even) elements in the form
         * [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form
         * [x1,y1,x2,y2,...,xn,yn].
         * Input 1: nums = [2,5,1,3,4,7]
         * Output 1: [2,3,5,4,1,7]
         */
        int[] num = { 2, 5, 1, 3, 4, 7 };
        int n = num.length;
        int[] ans = new int[n];

        int left = 0, right = n / 2, k = 0;
        while (right < n) {
            ans[k] = num[left];
            ans[k + 1] = num[right];
            k = k + 2;
            right = right + 1;
            left = left + 1;
        }

        // print ans
        System.out.println(Arrays.toString(ans));

    }
}
