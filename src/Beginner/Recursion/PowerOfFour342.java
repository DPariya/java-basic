package Beginner.Recursion;

public class PowerOfFour342 {
    public static void main(String[] args) {
        int n = 64;
        boolean ans = powerOf(n);
        System.out.println(ans);
    }

    public static boolean powerOf(int n) {
        if (n == 1) {
            return true;
        }
        if ((n % 4 != 0) || (n == 0)) {
            return false;
        }
        return powerOf(n / 4);
    }
}
