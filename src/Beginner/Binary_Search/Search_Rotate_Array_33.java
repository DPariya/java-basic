package Beginner.Binary_Search;

public class Search_Rotate_Array_33 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int res = searchInRotate(nums, target);
        System.out.println("Output --" + res);
    }

    public static int searchInRotate(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 1. Is left part sorted?
            if (nums[low] <= nums[mid]) {
                // 1.1 Is Target lies in-between low & mid? ** low <- target -> mid **
                if ((nums[low] <= target) && (target <= nums[mid])) {
                    high = mid - 1; // high on left
                } else {
                    low = mid + 1; // new Low : Means answer is on 2nd part, so created new low
                }
            } else {// 2. answer is on Right Part
                // 2.1 Is target lies in-between mid & high? ** mid <- target -> high
                if ((nums[mid] <= target) && (target <= nums[high])) {
                    low = mid + 1; // low to right side
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }
}