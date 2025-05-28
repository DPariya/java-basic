package AdvancedDSA.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum18 {
    public static void main(String[] args) {
        /*
         * Given an array nums of n integers, return an array of all the unique
         * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
         * 
         * ->0 <= a, b, c, d < n
         * ->a, b, c, and d are distinct.
         * ->nums[a] + nums[b] + nums[c] + nums[d] == target
         * 
         * You may return the answer in any order.
         * 
         * Input: nums = [1,0,-1,0,-2,2], target = 0
         * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
         */

        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int f = 0; f < n - 3; f++) {
            for (int s = f + 1; s < n - 2; s++) {
                int th = s + 1, fr = n - 1;
                while (th < fr) {
                    int sum = nums[f] + nums[s] + nums[th] + nums[fr];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[f], nums[s], nums[th], nums[fr]));
                        th++;
                        fr--;
                    }
                    if (sum < target) {
                        th++;
                    } else {
                        fr--;
                    }
                }
            }
        }
        // print ans
        System.out.println(new ArrayList<>(res));

    }

}
