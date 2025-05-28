package Beginner.Maths;

public class FindLargestPrime {
    /*
     * Given a positive integer ‘N' ( 1 <= N <= 1015). Find the largest prime factor
     * of a number.
     * Input 1: 6
     * Output 1: 3
     * Explanation 1: Prime factor of 6 are - 2, 3
     * Largest of them is '3'
     */
    public static void main(String[] args) {
        int n = 6;

        int max = 0;
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }
        if (n > 2) {
            max = n;
        }
        System.out.println("Largest Prime => " + max);
    }
}
