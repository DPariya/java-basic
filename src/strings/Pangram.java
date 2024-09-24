package strings;

public class Pangram {
    private String sentence;

    public Pangram(String s) {
        // TODO Auto-generated constructor stub
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
        Pangram obj = new Pangram(s);
        if (obj.isPangram()) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }

    }
}