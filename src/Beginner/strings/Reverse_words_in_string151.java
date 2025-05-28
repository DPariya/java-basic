package Beginner.strings;

public class Reverse_words_in_string151 {
    /*
     * Given an input string s, reverse the order of the words.
     * 
     * A word is defined as a sequence of non-space characters. The words in s will
     * be separated by at least one space.
     * 
     * Return a string of the words in reverse order concatenated by a single space.
     * 
     * Note that s may contain leading or trailing spaces or multiple spaces between
     * two words. The returned string should only have a single space separating the
     * words. Do not include any extra spaces.
     * Example 1:
     * 
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     */
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int n = s.length();
        int i = 0;
        String ans = "", tmp = "";
        while (i < n) {
            if (s.charAt(i) == ' ') {
                if (ans.equals(""))
                    ans = tmp;
                else
                    ans = tmp + " " + ans;
                tmp = "";
            } else {
                tmp += s.charAt(i);
            }
            i++;
        }
        if (!tmp.equals("")) {
            if (ans.equals(""))
                ans = tmp;
            else
                ans = tmp + " " + ans;

        }
        System.out.println(ans);
        // another way
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int j = words.length - 1; j >= 0; j--) {
            res.append(words[j]);
            if (j != 0) {
                res.append(" ");
            }
        }
        // return res.toString();
    }
}