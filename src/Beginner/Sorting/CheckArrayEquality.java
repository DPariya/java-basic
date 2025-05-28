package Beginner.Sorting;

import java.util.Arrays;

public class CheckArrayEquality {
    /*
     * Given two arrays A and B of equal size N, the task is to find if given arrays
     * are equal or not. Two arrays are said to be equal if both of them contain
     * same set of elements, arrangements (or permutation) of elements may be
     * different though.
     * Note : If there are repetitions, then counts of repeated elements must also
     * be same for two array to be equal.
     * 
     * Input 1: A[] = {1,2,5,4,0} , B[] = {2,4,5,0,1}
     * Output 1: true
     */
    public static void main(String[] args) {

        int[] input1 = { 1, 2, 5, 4, 0 };
        int[] input2 = { 2, 4, 5, 0, 1 };
        // first check length
        if (input1.length != input2.length) {
            System.out.println("Not Equal");
            return;
        }
        Arrays.sort(input1);
        Arrays.sort(input2);
        int n = input1.length;
        for (int i = 0; i < n; i++) {
            if (input1[i] != input2[i]) {
                System.out.println("Not Equal");
                break;
            }
        }

        System.out.println("Equal");

    }

}
