package Number_Bit;

public class CountTrailingZeroes {
    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        System.out.println(n & 1);
        while ((n & 1) == 0) {
            count++;
            n = n >> 1;
            System.out.println("After shift right-> " + n);
        }
        System.out.println(count);
    }
}
