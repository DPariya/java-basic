package Number_Bit;

public class AlternativeBits {
    public static void main(String[] args) {
        int n = 10; // 1010
        int y = n ^ (n >> 1);
        boolean ans = (y & (y + 1)) == 0;
        System.out.println("Is Alternative Bits => " + ans);
    }
}
