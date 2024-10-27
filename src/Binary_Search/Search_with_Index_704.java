package Binary_Search;

public class Search_with_Index_704 {
    public static void main(String[] args) {

        int[] num = { -1, 0, 44, 3, 6, 7 };
        int target = 44;
        int res = search(num, target);
        System.out.println("Index of " + target + " -- " + res);

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
        return -1;
    }
}