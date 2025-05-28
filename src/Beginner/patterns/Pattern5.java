package Beginner.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        /*
         * n=4
         ****
         ***
         **
         *
         */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // String s = "";
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
                // s = s.concat("*");
            }
            System.out.println("");
            // res.add(s);
        }

        // another way using ascii code, from portal

        /*
         * List<String> list = new ArrayList<>();
         * 
         * for (int i = 0; i < n; i++) {
         * StringBuilder s = new StringBuilder();
         * for (int j = 0; j <= i; j++) {
         * s.append((char) (j + 1 + '0'));
         * }
         * list.add(s.toString());
         * }
         * 
         * // Logic to print this
         * int maxLength = list.get(list.size() - 1).length();
         * 
         * for (String str : list) {
         * int padding = (maxLength - str.length()) / 2;
         * System.out.println(" ".repeat(padding / 2) + str);
         * }
         */

    }
}
