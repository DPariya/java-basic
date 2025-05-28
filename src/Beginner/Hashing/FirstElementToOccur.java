package Beginner.Hashing;

import java.util.HashMap;

public class FirstElementToOccur {
    /*
     * Given an array of N integers. Find the first element that occurs at least K
     * number of times. If the answer is not present in the array, return -1.
     * 
     * Input 1: N = 7, K = 2, A[] = {1, 7, 4, 3, 4, 8, 7}
     * Output 1: 4
     * 
     */
    public static void main(String[] args) {

        int[] a = { 1, 7, 4, 3, 4, 8, 7 };
        int k = 2, n = a.length;

        int max = 0;
        // find max
        for (int i : a) {
            if (max < i) {
                max = i;
            }
        }
        // create Hashmap
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        // int[] countArr = new int[max + 1];

        // increment count of each element of a
        for (int i = 0; i < n; i++) {
            int key = a[i];
            if (hashmap.containsKey(key)) {
                hashmap.put(key, hashmap.get(key) + 1);
            } else {
                hashmap.put(key, 1);
            }

            if (hashmap.get(key) == k) {
                System.out.println("first element that occurs at least K times  " + key);
                return;
            }
        }

        System.out.println("No element occurs at least K ");

    }

}
