package Maths;

public class EvenNumberDigit1295 {
    /*
     * Given an array nums of integers, return how many of them contain an even
     * number of digits.
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     */
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int sz = nums.length;
        int maxCount = 0;
        // 1: iterative way
        for (int i = 0; i < sz; i++) {
            int n = nums[i];
            int count = 0;
            System.out.println("n => " + n);
            while (n != 0) {
                n /= 10;
                count++;
            }

            System.out.println("------------------------- ");
            if (count % 2 == 0) {
                maxCount++;

            }
        }
        System.out.println("number with even digits=> " + maxCount);
        // 2: Another Optimized way
        int counter = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0)
                counter++;
        }
        System.out.println("number with even digits  optimized  way => " + counter);
        // 3. Logical way : most Optimized
        int count = 0;
        for (int x : nums) {
            if ((x >= 10 && x <= 99) || (x >= 1000 && x <= 9999) || (x == 100000)) {
                count++;
            }
        }
        System.out.println("Most Optimized way => " + count);

    }
}
