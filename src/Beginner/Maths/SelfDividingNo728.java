package Beginner.Maths;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNo728 {
    /*
     * A self-dividing number is a number that is divisible by every digit it
     * contains.
     * 
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
     * 0, and 128 % 8 == 0.
     * A self-dividing number is not allowed to contain the digit zero.
     * 
     * Given two integers left and right, return a list of all the self-dividing
     * numbers in the range [left, right] (both inclusive).
     * Input: left = 1, right = 22
     * Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
     */
    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isValid(i)) {
                ans.add(i);
            }
        }
        System.out.println("self-dividing number  => " + ans);

    }

    public static boolean isValid(int num) {
        int temp = num;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == 0 || temp % lastDigit != 0) {
                return false;
            }
            num /= 10;

        }
        return true;
    }
}
