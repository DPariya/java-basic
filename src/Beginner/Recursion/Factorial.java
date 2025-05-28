package Beginner.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // 120
        int ans = factNo(n);
        System.out.println(ans);
    }

    public static int factNo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factNo(n - 1);
    }
}
