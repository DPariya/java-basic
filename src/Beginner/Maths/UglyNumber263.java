package Beginner.Maths;

public class UglyNumber263 {
    public static void main(String[] args) {
        /*
         * An ugly number is a positive integer which does not have a prime factor other
         * than 2, 3, and 5.
         * 
         * Given an integer n, return true if n is an ugly number.
         * 
         * Input: n = 6
         * Output: true
         * Explanation: 6 = 2 × 3
         */
        int n = 6;
        if (n == 0) {
            System.out.println("false");
            return;
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
