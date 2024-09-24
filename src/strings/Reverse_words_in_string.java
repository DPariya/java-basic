package strings;

public class Reverse_words_in_string {
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
    }
}