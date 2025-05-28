package Number_Bit;

public class SumXORSubsets {
    public static void main(String[] args) {
        /*
         * Given an array arr[] of size n, we need to find the sum of all the values
         * that come from XORing all the elements of the subsets.
         * Input 1: arr[] = {1, 5, 6}
         * Output 1: 28
         * Explanation 1: Total Subsets = 23
         * 1 = 1
         * 5 = 5
         * 6 = 6
         * 1 ^ 5 = 4
         * 1 ^ 6 = 7
         * 5 ^ 6 = 3
         * 1 ^ 5 ^ 6 = 2
         * 0(empty subset)
         * Now SUM of all these XORs = 1 + 5 + 6 + 4 + 7 + 3 + 2 + 0 = 28
         */
        int[] input = { 1, 5, 6 };
        int sz = input.length, ans = 0, xr;

        for (int i = 0; i < (1 << sz); i++) {
            xr = 0;
            for (int j = 0; j < sz; j++) {
                if ((i & (1 << j)) == 0) {
                    xr ^= input[j];
                }
            }
            ans += xr;
        }
        System.out.println("Answer " + ans);

    }
}
