package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 11111;
        int ans = sum(n);
        System.out.println(ans);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sum(n / 10));
    }
}
