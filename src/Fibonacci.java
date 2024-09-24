import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to get Fibonacci series: ");
        int n = sc.nextInt();
        int prev1 = 1;
        int prev2 = 0;
        List<Integer> ans = new ArrayList<>();

        // for loop to print fibonacci series
        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                int num = prev1 + prev2;
                prev2 = prev1;
                prev1 = num;
                ans.add(num);
            }

            // for first two terms
            if (i == 1) {
                ans.add(0);
            }
            if (i == 2) {
                ans.add(1);
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        // Printing the Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
