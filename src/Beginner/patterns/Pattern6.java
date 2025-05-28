package Beginner.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         * hallow square
         * n=4
         * ****
         * * *
         * * *
         * ****
         * 
         */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // String s = "";

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
            // res.add(s);
        }

    }
}
