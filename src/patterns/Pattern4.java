package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        /*
         * n=4
         * 1
         * 12
         * 123
         * 1234
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // // String s = "";
        // for (int j = 1; j <= i + 1; j++) {
        // System.out.print(j);
        // // s = s.concat("*");
        // }
        // System.out.println("");
        // // res.add(s);
        // }

        // another way using ascii code, from portal

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // String s = "";
            StringBuilder s = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                // char temp = (char) (j + 97); // 97=> ASCII value of 'a' // 1st j = 0, 0+97=97
                // = 'a'
                // String str = "" + temp;// temp into a String. Concatenating "" with temp is a
                // common trick to convert a
                // char to a String in Java.
                // s = s.concat(str);
                s.append((char) (j + 1 + '0'));
            }
            list.add(s.toString());
        }

        // Logic to print this
        int maxLength = list.get(list.size() - 1).length();

        for (String str : list) {
            int padding = (maxLength - str.length()) / 2;
            System.out.println(" ".repeat(padding / 2) + str);
        }

    }
}
