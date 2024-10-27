package Binary_Search;

import java.util.Arrays;

//see input, having duplicate elements too
public class Minimum_Rotate_Sorted_Array_154D {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 0, 1 };
        System.out.println("Input --" + Arrays.toString(nums));

        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == nums[high]) {
                high--;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }

        int res = nums[low];
        System.out.println("Output --" + res);
    }
}