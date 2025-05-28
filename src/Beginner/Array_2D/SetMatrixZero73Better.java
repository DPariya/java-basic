package Beginner.Array_2D;

import java.util.*;

public class SetMatrixZero73Better {
    /*
     * Given an m x n integer matrix matrix, if an element is 0, set its entire row
     * and column to 0's.
     * 
     * You must do it in place.
     * 
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     */

    // *****************TC : O(2xnxm) */ not happy,
    // ***************** SC: O(n)+O(m)
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int n = mat.length;
        int m = mat[0].length;
        int[] rowMat = new int[n];
        int[] colMat = new int[m];
        // System.out.println("n= "+n);
        // System.out.println("m= "+m);
        for (int i = 0; i < n; i++) { // TC : nxm
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    rowMat[i] = 1;
                    colMat[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) { // nxm
            for (int j = 0; j < m; j++) {
                if (rowMat[i] == 1 || colMat[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

}
