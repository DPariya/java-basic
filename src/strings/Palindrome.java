package strings;

public class Palindrome {
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
