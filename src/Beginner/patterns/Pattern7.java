package Beginner.patterns;

import java.util.Scanner;

public class Pattern7 {
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
        for (int i = 0; i < n; i++) {
            // printing space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
            // res.add(s);
        }

    }
}
