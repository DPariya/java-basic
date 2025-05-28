package Beginner.Array_2D;

import java.util.*;

public class SetMatrixZero73Brute {
    /*
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row
     * and column to 0's.
     * 
     * You must do it in place.
     * 
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     */

    // *****************TC : O(nxm)x(nxm)+(nxm) */ not acceptable
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int n = mat.length;
        int m = mat[0].length;
        // System.out.println("n= "+n);
        // System.out.println("m= "+m);
        for (int i = 0; i < n; i++) { // TC : nxm
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    markRow(i, mat, m); // n
                    markColumn(j, mat, n);// m
                }
            }
        }
        for (int i = 0; i < n; i++) { // nxm
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    private static void markRow(int i, int[][] mat, int m) {
        for (int j = 0; j < m; j++) {
            if ((mat[i][j] != 0)) {
                mat[i][j] = -1;
            }
        }
    }

    private static void markColumn(int j, int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            if ((mat[i][j] != 0)) {
                mat[i][j] = -1;
            }
        }
    }
}
