package Beginner.Binary_Search;

public class CapacityToShip1011 {
    public static void main(String[] args) {
        // input
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int max = 0, sum = 0, n = weights.length;

        // find max and total capacity of ship
        for (int i = 0; i < n; i++) {
            if (weights[i] > max) {
                max = weights[i];
                sum += weights[i];
            }
        }

        // 1. max = minimum weight it can carry, sum = total capacity max
        int low = max, high = sum, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            // 2.let's say func checks, in given days can weight be filled? yes/no
            if (func(mid, weights, n, days) == true) {// yes
                // 2.1 then store potential answer and check for smaller ship weight
                ans = mid;
                high = mid - 1;
            } else { // no
                // 2.2 go for bigger ship
                low = mid + 1;
            }
        }
        System.out.println("Output-- " + ans);
    }

    public static boolean func(int capacity, int[] arr, int n, int d) {
        // calculate : what if you have that day, will you have do that thing
        int sum = 0, days = 1;
        for (int i = 0; i < n; i++) {
            // 1. (if) : filling the ship, checking is less than capacity
            if (sum + arr[i] <= capacity) {
                sum = sum + arr[i];
            } else {
                // if weight exceeded, increase the day: day 2
                days++;
                // whatever, we are putting will put the next day
                sum = arr[i];
            }
        }
        if (days <= d) {
            return true;
        }
        return false;
    }
}
