package Number_Bit;

public class CountTrailingZeroes {
    public static void main(String[] args) {
        /*
         * Given an integer N, the task is to find the number of trailing zeroes in the
         * binary representation of the given number.
         * Input 1: N = 12
         * Output 1: 2
         * Explanation 1: The binary representation of the number 13 is “1100”.
         * Therefore, there are two trailing zeros in the 12.
         */
        int n = 12;
        int count = 0;
        while ((n & 1) == 0) {
            count++;
            n = n >> 1;
            // System.out.println("After shift right-> " + n);
        }
        System.out.println("Answer is " + count);
    }
}
