package Beginner.Number_Bit;

public class SumOfTwoInteger {
    public static void main(String[] args) {
        /*
         * Given two integers a and b, return the sum of the two integers without using
         * the operators + and -.
         * Input: a = 1, b = 2
         * Output: 3
         */
        int a = 10; // 1010
        int b = 2;
        while (b != 0) {
            int carry = (a & b) << 1;// carry calculated
            a = a ^ b;// sum with carry
            b = carry;// move carry to next pointer
        }
        System.out.println("sum  => " + a);
    }
}
