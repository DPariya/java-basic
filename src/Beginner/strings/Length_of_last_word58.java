package Beginner.strings;

public class Length_of_last_word58 {
    /*
     * Given a string s consisting of words and spaces, return the length of the
     * last word in the string.
     * 
     * A word is a maximal
     * substring
     * consisting of non-space characters only.
     * Example 1:
     * 
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     */
    public static void main(String[] args) {
        String s = "Hello World";
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    System.out.print("Count = " + count);
                    return;
                }
            }
        }
        System.out.print("Count = " + count);

    }

}