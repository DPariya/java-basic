package Beginner.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        /*
         * hallow square
         * n=4
         * *
         * ***
         * *****
         * *******
         * *********
         */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) {
                stars = 2 * n - i - 1;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
            // res.add(s);
        }

    }
}
