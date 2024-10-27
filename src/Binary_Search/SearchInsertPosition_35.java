package Binary_Search;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {

        int[] num = { 1, 3, 5, 6, 7, 8 };
        int target = 4;
        int res = search(num, target);
        System.out.println("Index of " + target + " would be " + res);

    }

    public static int search(int[] num, int target) {
        int n = num.length - 1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == num[mid]) {
                return mid;
            } else if (target <= num[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}