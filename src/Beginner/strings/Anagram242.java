package Beginner.strings;

public class Anagram242 {
    /*
     * Given two strings s and t, return true if t is an
     * anagram
     * of s, and false otherwise.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "anagram", t = "nagaram"
     * 
     * Output: true
     */
    public static void main(String[] args) {
        String s = "anagram", t = "naffgaram";

        if (s.length() != t.length()) {
            System.out.println("1 : not valid Anagram");
            return;
        }

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int count : chars) {
            if (count != 0) {
                System.out.println("not valid Anagram");
                break;
            }
        }
        System.out.println("valid Anagram");
    }
}