package Beginner.Maths;

public class FindGCD {
    public static void main(String[] args) {
        int a = 36, b = 60;
        // to find gdc(a,b) = gcd(a-b,b) ; (a>=b)
        // gdc(a,b)=gcd(b,a%b) till b = 0
        if (a < b) { // cause (a>=b) must
            a = a + b;
            b = a - b;
            a = a - b;
        }
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        System.out.println("GCD => " + a);
    }
}
