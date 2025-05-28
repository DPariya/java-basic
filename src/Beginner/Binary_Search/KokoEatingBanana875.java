package Beginner.Binary_Search;

public class KokoEatingBanana875 {
    public static void main(String[] args) {
        // input
        int[] piles = { 3, 6, 7, 11 };
        int hours = 8;

        int l = 0, r = 1000000009;
        while (l < r) {
            int mid = (l + r) / 2;
            if (func(mid, piles, hours) == true) {// yes
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("Answer " + l);

    }

    public static boolean func(int k, int[] piles, int h) {
        //
        int hrRequired = 0;
        for (int banana : piles) {
            hrRequired += Math.ceil((banana * 1.0) / k);
        }
        if (hrRequired <= h) {
            return true;
        }
        return false;
    }
}
