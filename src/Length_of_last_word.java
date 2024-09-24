public class Length_of_last_word {
    public static void main(String[] args) {
        String s = " fly me   to   the moon ";
        // create instance of class
        Length_of_last_word obj = new Length_of_last_word();

        // call below method using this obj instance of class

        int length = obj.lengthOfLastWord(s);
        System.out.println(length);

    }

    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    return count;
                }
            }
        }
        return count;
    }
}