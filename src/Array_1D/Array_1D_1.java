
public class Array_1D_1 {
    public static void main(String[] args) {
        /*
         * Given a zero-based permutation nums (0-indexed), build an array ans of the
         * same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and
         * return it.
         * 
         * A zero-based permutation nums is an array of distinct integers from 0 to
         * nums.length - 1 (inclusive).
         * Input 1: nums = [0,2,1,5,3,4]
         * Output 1: [0,1,2,4,5,3]
         */
        int[] num = { 0, 2, 1, 5, 3, 4 };
        int n = num.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = num[num[i]];
        }

        // print ans
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
