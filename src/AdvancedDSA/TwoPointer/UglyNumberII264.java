package AdvancedDSA.TwoPointer;

import java.util.ArrayList;

public class UglyNumberII264 {
    /*
     * An ugly number is a positive integer whose prime factors are limited to 2, 3,
     * and 5.
     * 
     * Given an integer n, return the nth ugly number.
     * Input: n = 10
     * Output: 12
     * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10
     * ugly numbers.
     */
    public static void main(String[] args) {
        int n = 10;

        if (n == 1) {
            System.out.println(1);
            return;
        }

        // list to store
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int p1 = 0, p2 = 0, p3 = 0;

        while (list.size() < n) {
            int v1 = list.get(p1) * 2;
            int v2 = list.get(p2) * 3;
            int v3 = list.get(p3) * 5;

            int min = Math.min(v1, Math.min(v2, v3));

            list.add(min);

            if (min == v1)
                p1++;
            if (min == v2)
                p2++;
            if (min == v3)
                p3++;

        }
        System.out.println(list.get(list.size() - 1));

    }

}
