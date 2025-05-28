package Beginner.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleFive {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int k = 0;
        int n = sc.nextInt();
        int ans[] = new int[n / 5];
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                ans[k++] = i;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
