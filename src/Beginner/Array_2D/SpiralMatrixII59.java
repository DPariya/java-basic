package Beginner.Array_2D;

public class SpiralMatrixII59 {
    /*
     * Given a positive integer n, generate an n x n matrix filled with elements
     * from 1 to n2 in spiral order.
     * Input: n = 3
     * Output: [[1,2,3],[8,9,4],[7,6,5]]
     */
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int k = 1;
        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = k++;

            }
            top++;
            // right col
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = k++;
            }
            right--;
            // bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = k++;
            }
            bottom--;
            // left col
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = k++;
            }
            left++;
        }
        // print result
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
