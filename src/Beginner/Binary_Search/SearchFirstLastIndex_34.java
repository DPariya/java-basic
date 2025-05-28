package Beginner.Binary_Search;

/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position 
 * of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchFirstLastIndex_34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int res[] = searchRange(nums, target);
        for (int i : res) {
            System.out.println("--" + i);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = FirstOccurrence(nums, target);
        int end = LastOccurrence(nums, target);
        int[] ans = new int[2];
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int FirstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;// to check more occurrence in left till end
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int LastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                ans = mid;
                low = mid + 1;// to check more occurrence in right till end
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}