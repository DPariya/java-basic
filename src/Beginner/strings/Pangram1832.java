package Beginner.strings;

public class Pangram1832 {
    private String sentence;

    /*
     * A pangram is a sentence where every letter of the English alphabet appears at
     * least once.
     * 
     * Given a string sentence containing only lowercase English letters, return
     * true if sentence is a pangram, or false otherwise.
     * Example 1:
     * 
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English
     * alphabet.
     */
    public Pangram1832(String s) {

        this.sentence = s;
    }

    public boolean isPangram() {
        boolean[] words = new boolean[26];
        int indx = 0;
        int n = sentence.length();
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                indx = ch - 'a';
            } else if (ch >= 'A' && ch <= 'Z') {
                indx = ch - 'A';
            } else {
                continue;
            }
            words[indx] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!words[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        Pangram1832 obj = new Pangram1832(s);
        if (obj.isPangram()) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }

    }
}