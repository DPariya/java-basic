package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        /*
         * n=4
         *
         **
         ***
         ****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                // s = s.concat("*");
            }
            System.out.println("");
            // res.add(s);
        }
        // res.forEach(item -> System.out.println(res));

    }
}
