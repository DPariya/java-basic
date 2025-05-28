package Beginner.Backtracking;

import java.util.*;

public class Permutation46 {
    /*
     * #L78
     * Given an array nums of distinct integers, return all the possible
     * permutations
     * Return the solution in
     * any order.
     * Input: nums = [1,2,3]
     * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = { 1, 2, 3 };
        // Create Instance
        Permutation46 pr = new Permutation46();
        List<Integer> path = new ArrayList<>();
        pr.func(result, path, nums);
        System.err.println(result);

    }

    void func(List<List<Integer>> res, List<Integer> path, int[] nums) {
        if (path.size() == nums.length) {// add only is there is match, we do not add every element
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            // check for duplicate
            if (path.contains(nums[i])) {
                continue;
            }
            // add element
            path.add(nums[i]);
            func(res, path, nums);
            path.remove(path.size() - 1);
        }
    }

}