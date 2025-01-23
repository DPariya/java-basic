package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPrimeFactors {
    /*
     * Given a number n, write an efficient function to print all prime factors of
     * n. For example, if the input number is 12, then the output should be “2 2 3”.
     * And if the input number is 315, then the output should be “3 3 5 7”.
     * Input 1: 315
     * Output 1: 3 3 5 7
     * Explanation 1: Prime Factors of 315 are 3, 3, 5, 7
     */
    public static void main(String[] args) {
        int n = 315;
        // 1. Pull out all 2s
        // 2. pull out 3 to 9
        List<Integer> ans = new ArrayList<Integer>();
        while (n % 2 == 0) {
            ans.add(2);
            n /= 2;
        }
        // 2
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                ans.add(i);
                n /= i;
            }
        }
        // if any factors are remaining
        if (n > 2) {
            ans.add(n);
        }

        int sz = ans.size();
        int[] res = new int[sz];
        for (int i = 0; i < sz; i++) {
            res[i] = ans.get(i);
        }

        System.out.println("All Prime Factors => " + Arrays.toString(res));
    }
}
