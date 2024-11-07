package Recursion;

public class Fibonnaci {
    // sequence of numbers where each term is the sum of the two preceding ones
    public static void main(String[] args) {
        int n = 5; // 5
        int ans = fab(n); // 0 1 1 2 3 5
        System.out.println(ans);
    }

    public static int fab(int a) {
        if (a == 0 || a == 1) {
            return a;
        }
        // System.out.println(a);

        return fab(a - 1) + fab(a - 2);
    }
}
