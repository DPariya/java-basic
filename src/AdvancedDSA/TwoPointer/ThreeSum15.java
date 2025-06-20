package AdvancedDSA.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum15 {
    public static void main(String[] args) {
        /*
         * Given an integer array nums, return all the triplets [nums[i], nums[j],
         * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
         * nums[k] == 0.
         * 
         * Notice that the solution set must not contain duplicate triplets.
         * Input: nums = [-1,0,1,2,-1,-4]
         * Output: [[-1,-1,2],[-1,0,1]]
         * Explanation:
         * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         * The distinct triplets are [-1,0,1] and [-1,-1,2].
         * Notice that the order of the output and the order of the triplets does not
         * matter.
         */

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int no = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int first = 0; first < no - 2; first++) {
            int sec = first + 1, third = no - 1;
            while (sec < third) {
                int sum = nums[first] + nums[sec] + nums[third];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[first], nums[sec], nums[third]));

                }
                if (sum < 0) {
                    sec++;
                } else {
                    third--;
                }
            }
        }
        // print ans
        System.out.println(new ArrayList<>(result));

    }

}
