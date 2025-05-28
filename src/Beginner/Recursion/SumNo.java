package Beginner.Recursion;

public class SumNo {
    public static void main(String[] args) {
        int n = 5; // 120
        int ans = sum(n);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
