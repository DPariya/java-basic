package Number_Bit;

public class PowerOfFour342 {
    public static void main(String[] args) {
        /*
         * Given an integer n, return true if it is a power of Four. Otherwise, return
         * false.
         * 
         * An integer n is a power of Four, if there exists an integer x such that n ==
         * 4^x
         * 
         * Input: n = 16
         * Output: true
         * Explanation: 16 = 4^2
         */
        float n = 16;
        if (n == 1) {
            System.out.println("true");
            return;
        } else {
            boolean isPowerFour = (n % 4 == 0) || (n == 0);
            System.out.println("isPowerFour : " + isPowerFour + " which  -> " + n / 4);
        }

    }
}
