import java.util.Scanner;

public class Array_1D_shuffle {
    public static void main(String[] args) {
        // Richest Customer Wealth
        // Input 1: accounts = [[1,2,3],[3,2,1]]
        // Output 1: 6
        int[] num = { 2, 5, 1, 3, 4, 7 };
        int n = num.length / 2;
        int[] ans = new int[n];
        int i = 0; // start of array : x1
        int j = n; // partition of array : y1
        // Given the array nums consisting of n(n will be even) elements in the form
        // [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form
        // [x1,y1,x2,y2,...,xn,yn].
        for (int k = 0; k < num.length; k++) {
            if (k % 2 == 0) {
                ans[k] = num[i];
                i++;
            } else {
                ans[k] = num[j];
                j++;
            }
        }

        // print ans
        System.out.println(ans);

    }
}
