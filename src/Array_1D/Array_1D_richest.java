
public class Array_1D_richest {
    public static void main(String[] args) {
        // Richest Customer Wealth
        /*
         * You are given an m x n integer grid accounts where accounts[i][j] is the
         * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
         * bank. Return the wealth that the richest customer has.
         * A customer's wealth is the amount of money they have in all their bank
         * accounts. The richest customer is the customer that has the maximum wealth.
         * Input 1: accounts = [[1,2,3],[3,2,1]]
         * Output 1: 6
         */

        int[][] num = { { 1, 2, 3 }, { 3, 2, 1 }, { 10, 5, 3 } };
        int n = num.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int l = num[i].length;
            int sm = 0;
            for (int j = 0; j < l; j++) {
                sm += num[i][j];
            }
            // if (sm > ans) {
            // ans = sm;
            // }
            ans = Math.max(sm, ans);
        }

        // print ans
        System.out.println(ans);

    }
}
