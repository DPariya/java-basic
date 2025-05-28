package Beginner.Binary_Search;

public class SquareRoot_69 {
    public static void main(String[] args) {

        int target = 16;
        int res = square(target);
        System.out.println("Square root of " + target + " is " + res);

    }

    public static int square(int n) {
        int low = 0, high = n, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = (int) mid;
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;

            }
        }
        return ans;
    }
}