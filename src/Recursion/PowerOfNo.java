package Recursion;

public class PowerOfNo {
    public static void main(String[] args) {
        int a = 3, b = 4; // 120
        int ans = powerOf(a, b);
        System.out.println(ans);
    }

    public static int powerOf(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * powerOf(a, b - 1);
    }
}
