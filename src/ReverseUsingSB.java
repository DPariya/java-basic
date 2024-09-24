public class ReverseUsingSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Original : " + sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("reverse : " + sb);
        // *** TC : O(n/2) = O(n) */
        // -----------------without using inbuilt function : CHARAT ----
        String s = "dipti";
        String rev = "";
        System.out.println("original : " + s);
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("reverse : " + rev);
        // *** TC : O(n) */
        // ---------------------------APPEND & CHARAT -----------------------------
        StringBuilder sb2 = new StringBuilder("pariya");
        System.out.println("Using  Both (original) : " + sb2);
        StringBuilder sb3 = new StringBuilder("");
        for (int i = sb2.length() - 1; i >= 0; i--) {
            sb3.append(sb2.charAt(i));
        }
        System.out.println("using append & chart at (reverse ): " + sb3);
        // *** TC : O(n) */
    }
}
