package Beginner.Number_Bit;

public class AlternativeBits {
    public static void main(String[] args) {
        /*
         * Check if a number has bits in an alternate pattern.
         * Input 1: 10
         * Output 1: true
         * Explanation 1: 10 in binary = (1010), has an alternate pattern.
         */
        int n = 10; // 1010
        int y = n ^ (n >> 1);
        boolean ans = (y & (y + 1)) == 0;
        System.out.println("Is Alternative Bits => " + ans);
    }
}
