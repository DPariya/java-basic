package Basic;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome : ");
        // palindrome : do mot use in interview
        int a = sc.nextInt();
        // convert int to string
        /*
         * String s = String.valueOf(a);
         * String reverseStr = "";
         * int k =0;
         * for (int i = s.length() - 1; i >= 0; i--) {
         * reverseStr += s.charAt(i);
         * }
         * if(s.equals(reverseStr)){
         * System.out.println("Palindrome");
         * }else{
         * System.out.println("Not a palindrome");
         * }
         */

        // another easy way , above is wrong for interview, USE BELOW IN INTERVIEW
        int num = a;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev == a ? "Palindrome" : "Not a palindrome");
    }
}
