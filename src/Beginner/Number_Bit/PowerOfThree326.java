package Beginner.Number_Bit;

public class PowerOfThree326 {
    public static void main(String[] args) {
        /*
         * Given an integer n, return true if it is a power of three. Otherwise, return
         * false.
         * 
         * An integer n is a power of three, if there exists an integer x such that n ==
         * 3x
         * 
         * Input: n = 27
         * Output: true
         * Explanation: 27 = 3^3
         */
        float n = 18;
        if (n == 1) {
            System.out.println("true");
            return;
        } else {
            boolean isPowerThree = (n % 3 == 0) || (n == 0);
            System.out.println("isPowerThree : " + isPowerThree + " which  -> " + n / 3);
        }

    }
}
