package Beginner.Recursion;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int ans = sum(arr, n);
        System.out.println(ans);
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return (arr[n - 1] + sum(arr, n - 1));
    }
}
