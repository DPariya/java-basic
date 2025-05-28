package Beginner.Array_1D;

import java.util.Arrays;

public class CheckArithmeticProgression {
    /*
     * Given an array of N integers. Write a program to check whether an arithmetic
     * progression can be formed using all the given elements.
     * 
     * arr 1: arr[] = { 0,12,4,8 }
     * Output 1: true
     * 
     */
    public static void main(String[] args) {

        int[] arr = { 0, 12, 4, 8 };
        int n = arr.length;
        if (n < 2) {
            System.out.println("False");
            return;
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");

    }

}
