package AdvancedDSA.TwoPointer;

public class longestValidParentheses32 {
    /*
     * Given a string containing just the characters '(' and ')', return the length
     * of the longest valid (well-formed) parentheses
     * substring
     * .Input: s = "(()"
     * Output: 2
     * Explanation: The longest valid parentheses substring is "()".
     */
    public static void main(String[] args) {
        int open = 0, close = 0, ans1 = 0, ans2 = 0;
        String s = ")()())";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                ans1 = Math.max(ans1, open + close);
            } else if (close > open) {
                open = 0;
                close = 0;
            }
        }
        // right to left
        // Reset open and close before second scan
        open = 0;
        close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                ans2 = Math.max(ans2, open + close);
            } else if (open > close) {
                open = 0;
                close = 0;
            }
        }
        System.out.println(Math.max(ans1, ans2));

    }
}
