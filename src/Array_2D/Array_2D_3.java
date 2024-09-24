package Array_2D;

import java.util.List;
import java.util.ArrayList;

public class Array_2D_3 {
    public static void main(String[] args) {
        int n = 3, m = 2;
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        // List<List<Integer>> indices = new ArrayList<>();
        // indices.add(List.of(0, 1));
        // indices.add(List.of(1, 1));

        int nums = indices[0].length;
        // make matrix with 0s
        // List<List<Integer>> mat = new ArrayList<>();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            // List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // row.add(0);
                mat[i][j] = 0;
            }
            // mat.add(row);
        }

        // increment as given indices
        for (int i = 0; i < nums; i++) {
            int ri = indices[i][0];
            int ci = indices[i][1];
            System.out.println(ri + " " + ci);
            // inc all cell in row
            for (int j = 0; j < nums; j++) {
                System.out.println("mat[ri][j]    " + mat[ri][j]);
                mat[ri][j]++;
            }
            // inc all cell in column
            for (int k = 0; k < n; k++) {
                mat[ci][k]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
