package Beginner.Maths;

public class SumOfEvenFactors {
    /*
     * Given a number N, the task is to find the even factor sum of a number.
     * Input 1: 30
     * Output 1: 48
     * Explanation 1: Even dividers sum 2 + 6 + 10 + 30 = 48
     */
    public static void main(String[] args) {
        int n = 30;

        int res = 0;
        for (int i = 2; i <= n; i++) {
            if ((n % i == 0) && (i % 2 == 0)) {
                res += i;
            }
        }
        System.out.println("1st way => " + res);
        // More Optimized
        int res2 = 0;
        for (int i = 2; i < n + 1; i += 2) {
            if (n % i == 0) {
                res2 += i;
            }

        }

        System.out.println("sum of even prime factors => " + res2);
    }
}
