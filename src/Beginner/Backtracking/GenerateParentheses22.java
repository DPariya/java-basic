package Beginner.Backtracking;

import java.util.*;

public class GenerateParentheses22 {
    /*
     * #L22
     * Given n pairs of parentheses, write a function to generate
     * all combinations of well-formed parentheses.
     * Input: n = 3
     * Output: ["((()))","(()())","(())()","()(())","()()()"]
     */
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        int n = 3;
        // Create Instance
        GenerateParentheses22 gp = new GenerateParentheses22();
        gp.func(ans, n, 0, 0, "");
        System.err.println(ans);
    }

    void func(List<String> ans, int n, int open, int close, String s) {
        if (open == close && open == n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            func(ans, n, open + 1, close, s + "(");
        }
        if (open > close) {
            func(ans, n, open, close + 1, s + ")");
        }
    }
}