package Beginner.Recursion;

public class PowerOfNo {
    public static void main(String[] args) {
        int a = 3, b = 4; // 81
        int ans = powerOf(a, b);
        System.out.println(ans);

        /**
         * Recursive approach
         * double a = 2.00000;
         * int b = 10;
         * ans = pow(a,Math.abs(b));
         * if(b<0) return 1/ans;
         * return ans;
         * 
         * TC : O(log n), SC : O(log n) (recursive stack)
         */

    }

    public static int powerOf(int a, int b) { // TC: O(n),SC : O(n) (recursive stack)
        if (b == 0) {
            return 1;// Base case: x^0 = 1
        }
        return a * powerOf(a, b - 1);
    }
    /*
     * public static double pow(double a, int b) {
     * if (b == 0)
     * return 1;
     * 
     * //recursive call
     * double half = pow(a, b / 2); // Divide problem into half
     * 
     * if(b%2==0) // even
     * return half * half; // Even exponent: a^b = (a^(b/2))²
     * else
     * return a * half * half; // Odd exponent: a^b = a * (a^(b/2))²
     * }
     */

    // BEST
    /*
     * public double myPow(double x, int n) {
     * long power = Math.abs((long) n); // Handle Integer.MIN_VALUE edge case
     * double result = 1.0;
     * 
     * while (power > 0) {
     * if ((power & 1) == 1) { // If n is odd, multiply x
     * result *= x;
     * }
     * x *= x; // Square x for the next power
     * power >>= 1; // Equivalent to n = n / 2
     * }
     * 
     * return (n < 0) ? 1 / result : result; // If n was negative, take reciprocal
     * }
     */
}
