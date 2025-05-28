import java.util.Arrays;

public class Array_1D_2RunningSum {
    public static void main(String[] args) {
        /*
         * Given an array nums. We define a running sum of an array as runningSum[i] =
         * sum(nums[0]…nums[i]). Return the running sum of nums.
         * Input 1: nums = [1,2,3,4]
         * Output 1: [1,3,6,10]
         */

        int[] input = { 1, 2, 3, 4 };
        int n = input.length;
        int[] ans = new int[n];

        if (input == null || input.length == 0) {
            System.out.println(new int[0]);
            return;
        }
        ans[0] = input[0];
        for (int i = 1; i < n; i++) {

            ans[i] = ans[i - 1] + input[i];
        }

        // print ans
        System.out.println(Arrays.toString(ans));

    }
}
