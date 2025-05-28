package Beginner.Basic;

import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int rev = 0, d;
        int n = sc.nextInt();
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
