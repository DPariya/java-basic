package Beginner.strings;

public class Palindrome125 {
    /*
     * A phrase is a palindrome if, after converting all uppercase letters into
     * lowercase letters and removing all non-alphanumeric characters, it reads the
     * same forward and backward. Alphanumeric characters include letters and
     * numbers.
     * 
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * Example 1:
     * 
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char front = s.charAt(i);
            char last = s.charAt(n - i - 1);
            if (front != last) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madamssss";
        System.out.println(isPalindrome(s));
    }
}
