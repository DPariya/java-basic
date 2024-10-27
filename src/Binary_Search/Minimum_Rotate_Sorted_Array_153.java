package Binary_Search;

import java.util.Arrays;

public class Minimum_Rotate_Sorted_Array_153 {
    public static void main(String[] args) {
        int[] nums = { 8, 9, 10, 11, 12, 13, 6, 7 };
        System.out.println("Input --" + Arrays.toString(nums));
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }

        int res = nums[low];
        System.out.println("Output --" + res);
    }
}