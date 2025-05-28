package Beginner.Maths;

public class CountPrimeOfN {
    /*
     * Given a number N, count the all prime till given no.
     * Input 1: 50
     * Output 1: 15
     * Explanation 1: Even dividers sum 2 + 6 + 10 + 30 = 48
     */
    public static void main(String[] args) {
        int n = 50;
        if (n < 2) {
            System.out.println("No prime ");
            return;
        }

        // create a boolean array to store all prime
        boolean[] isPrime = new boolean[n + 1];
        // List<Integer> pr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;

        }
        // System.out.println("i => " + Arrays.toString(isPrimeNo));

        // Start from 2 and eliminate multiples
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;

                }

            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                System.out.print(" " + i); // print all prime here

            }
        }

        System.out.println("Prime count us => " + count);
    }
}
