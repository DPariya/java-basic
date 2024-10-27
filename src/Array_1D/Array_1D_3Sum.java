
import java.util.*;

public class Array_1D_3Sum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Set<List<Integer>> result = new HashSet<>();
        // Sort all elements
        Arrays.sort(nums);
        // Now fix the first element and find other to same as Two Sum Problem
        // note that since we need three element we need to iterate till nums.length-2
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // add set to result, and continue to find other triplets
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // print ans
        System.out.println(result);

    }
}
