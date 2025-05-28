package Beginner.Array_2D;

import java.util.*;

public class SetMatrixZero73Optimal {
    /*
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row
     * and column to 0's.
     * 
     * You must do it in place.
     * 
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     */

    // *****************TC : O(2xnxm) */ same ,but happy cause space com. reduced
    // ***************** SC: O(1)
    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int n = mat.length;
        int m = mat[0].length;
        // int[] rowMat = new int[n]; // mat[..][0] -> first row
        // int[] colMat = new int[m]; // mat[0][..] -> first col
        // System.out.println("n= "+n);
        // System.out.println("m= "+m);
        int col0 = 1;
        // this will mark 1 to 1st col row
        for (int i = 0; i < n; i++) { // TC : nxm
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    // mark the ith row
                    mat[i][0] = 0;
                    // mark the jth col
                    if (j != 0) {
                        mat[0][j] = 0;
                    } else {
                        col0 = 0;
                    }

                }
            }
        }
        // to mark rather then 1st row, col, remaining square of matrix
        for (int i = 1; i < n; i++) { // nxm
            for (int j = 1; j < m; j++) {
                // check if 1st row/col is marked then only mark it 1
                if (mat[i][j] != 0) {
                    if (mat[0][j] == 0 || mat[i][0] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }
        }
        // now check from 1st row , [0][0] is 0, then every col is 0,
        if (mat[0][0] == 0) {
            // mark entire col 0
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }
        // now check col0 variable for row
        if (col0 == 0) {
            // mark entire row 0
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

}
