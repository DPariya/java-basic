package Array_2D;

import java.util.Scanner;

//demo of 2D array
public class Array_2D_cell_with_odd_1252 {
    /*
     * There is an m x n matrix that is initialized to all 0's. There is also a 2D
     * array indices where each indices[i] = [ri, ci]
     * represents a 0-indexed location to perform some increment operations on the
     * matrix.
     * 
     * For each location indices[i], do both of the following:
     * 
     * Increment all the cells on row ri.
     * Increment all the cells on column ci.
     * Given m, n, and indices, return the number of odd-valued cells in the matrix
     * after applying the increment to all locations in indices.
     * Input: m = 2, n = 3, indices = [[0,1],[1,1]]
     * Output: 6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs
        int m = 2, n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        int[] row = new int[m];
        int[] col = new int[n];

        // Tracks how many times row i,col j has been incremented.
        for (int[] index : indices) {
            row[index[0]]++; // Increment row r
            col[index[1]]++; // Increment column c
        }
        int maxCount = 0;
        // now count the row + col
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = row[i] + col[j];
                if (val % 2 != 0) {
                    maxCount++;
                }
            }
        }

        System.out.println("maxCount " + maxCount);
    }
}
