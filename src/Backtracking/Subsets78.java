
import java.util.*;

public class Subsets78 {
    /*
     * #L78
     * Given an integer array nums of unique elements, return all possible subsets
     * (the power set).
     * The solution set must not contain duplicate subsets. Return the solution in
     * any order.
     * Input: nums = [1,2,3]
     * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     */
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = { 4, 1, 2, 3, 4 };
        // Create Instance
        Subsets78 sb = new Subsets78();
        sb.func(nums, 0, new ArrayList<>(), result);
        System.err.println(result);
    }

    void func(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path)); // adding the path, at start -> []

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            func(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }

    }
}