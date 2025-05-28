package Beginner.Recursion;

import java.util.*;

/*
 * Given a list arr of n integers, return sums of all subsets in it.
 *  Output sums can be printed in any order.
 * 
 * Input: n = 3, arr = {1, 2, 1}
 * Output: 0 1 1 2 2 3 3 4
 */
public class SubsetSumGeek {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        sol(arr, 0, arr.size() - 1, 0, ans);
        return ans;
    }

    void sol(ArrayList<Integer> arr, int l, int r, int sum, ArrayList<Integer> ans) {
        // int low=0, high=arr.length-1;
        if (l > r) {
            ans.add(sum);
            return;
        }
        // part
        sol(arr, l + 1, r, sum + arr.get(l), ans);
        // do not part
        sol(arr, l + 1, r, sum, ans);
    }

    public static void main(String[] args) {
        SubsetSumGeek solution = new SubsetSumGeek();
        // Example input
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        int n = arr.size();
        ArrayList<Integer> result = solution.subsetSums(arr, n);

        // Print the result
        System.out.println(result);
    }
}
