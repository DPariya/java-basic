package Binary_Search;

//A peak element is an element that is strictly greater than its neighbors.
public class FindPeakElement162 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Peak Element is " + nums[low]);
    }
}
