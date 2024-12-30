package Recursion;

public class PowerOfThree326 {
    public static void main(String[] args) {
        int n = 27;
        boolean ans = powerOf(n);
        System.out.println(ans);
    }

    public static boolean powerOf(int n) {
        if (n == 1) {
            return true;
        }
        if ((n % 3 != 0) || (n == 0)) {
            return false;
        }
        return powerOf(n / 3);
    }
}
