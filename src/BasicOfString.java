import java.util.Scanner;

public class BasicOfString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String s1 = "My name is Dipti";
        String simpleName = s1.substring(11, s1.length()); // s1.length() na lakhi to
        // chale, default last sudhi lese
        System.out.println(simpleName);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // sb.charAt(3);
        System.out.println("Char At : " + sb);
        // sb.insert(2, 'n');
        System.out.println("inserted : " + sb);
        sb.setCharAt(1, 'o');
        System.out.println("set CharAt : " + sb);

    }
}
