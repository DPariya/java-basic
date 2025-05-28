package Beginner.Basic;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong : ");
        // palindrome : do mot use in interview
        int a = sc.nextInt();
        int num = a;

        // make instance of this class to invoke count method
        // Armstrong obj = new Armstrong();
        int digitLength = countLength(a); // because it's static, do not need to make object
        int arm = 0;
        while (num != 0) {
            int digit = num % 10;
            // power function here
            arm += power(digit, digitLength);
            num /= 10;

        }

        System.out.println(a == arm ? "Armstrong" : "Not Armstrong");
    }

    public static int countLength(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int power(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }

}
