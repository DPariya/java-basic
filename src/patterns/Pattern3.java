package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        /*
         * n=4
         * a
         * ab
         * abc
         * abcd
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // String s = "";
            for (char ch = 'a'; ch <= 'a' + i; ch++) {
                System.out.print(ch);
                // s = s.concat("*");
            }
            System.out.println("");
            // res.add(s);
        }

        // another way using ascii code, from portal
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j <= i; j++) {
                char temp = (char) (j + 97); // 97=> ASCII value of 'a' // 1st j = 0, 0+97=97 = 'a'
                String str = "" + temp;// temp into a String. Concatenating "" with temp is a common trick to convert a
                                       // char to a String in Java.
                s = s.concat(str);
            }
            list.add(s);
        }
        // res.forEach(item -> System.out.println(res));

    }
}
