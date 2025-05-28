package Binary_Search;

public class NthDigit400 {
    /*
     * Given an integer n, return the nth digit of the infinite integer sequence [1,
     * 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
     * Input: n = 11
     * Output: 0
     * Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
     * 11, ... is a 0, which is part of the number 10.
     */
    public static void main(String[] args) {

        int n = 3; // 11

        int digitCount = 1;
        long range = 9;
        long start = 1;
        // find the range where n falls
        while (n > digitCount * range) {
            n -= digitCount * range;
            digitCount++;
            range *= 10;
            start *= 10;
        }
        // find actual number
        long no = start + (n - 1) / digitCount;
        String noStr = Long.toString(no);
        // find the exact digit in the number

        int res = noStr.charAt((n - 1) % digitCount) - '0';
        System.out.println("nth digit " + res);

    }

}