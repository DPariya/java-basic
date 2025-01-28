package Maths;

public class NoOfCommonFactor2427 {
    /*
     * Given two positive integers a and b, return the number of common factors of a
     * and b.
     * 
     * An integer x is a common factor of a and b if x divides both a and b.
     * 
     * Example 1:
     * 
     * Input: a = 12, b = 6
     * Output: 4
     * Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
     */
    // It is like to find GDP and then count common factor
    public static void main(String[] args) {
        int a = 12, b = 6;
        // make sure a>b, if not make it
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        // find the GCD from a,b
        int gcd = findGcd(a, b);
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        System.out.println("Common factors  => " + count);

    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
