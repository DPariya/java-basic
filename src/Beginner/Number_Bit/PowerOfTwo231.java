package Beginner.Number_Bit;

public class PowerOfTwo231 {
    public static void main(String[] args) {
        /*
         * Given an integer n, return true if it is a power of two. Otherwise, return
         * false.
         * 
         * An integer n is a power of two, if there exists an integer x such that n ==
         * 2x.
         * Input: n = 16
         * Output: true
         * Explanation: 24 = 16
         */
        int n = 1;
        if (n <= 0) {
            System.out.println("False");
            return;
        } else {
            boolean isPowerTwo = (n > 0) && ((n & (n - 1)) == 0);
            System.out.println(isPowerTwo);
        }

    }
}
