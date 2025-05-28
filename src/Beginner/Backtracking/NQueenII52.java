package Beginner.Backtracking;

import java.util.*;

public class NQueenII52 {
    /*
     * #L52
     * The n-queens puzzle is the problem of placing n queens on
     * an n x n chessboard such that no two queens attack each other.
     * Given an integer n, return the number
     * of distinct solutions to the n-queens puzzle.
     * Input: n = 4
     * Output: 2
     */
    static int sol = 0;

    public static void main(String[] args) {
        List<List<String>> ans = new ArrayList<>();
        int n = 4;
        // Create Instance
        NQueenII52 pr = new NQueenII52();
        boolean[][] board = new boolean[n][n];
        pr.fun(ans, board, n, 0);
        System.err.println(sol);

    }

    void fun(List<List<String>> ans, boolean[][] board, int n, int row) {
        // If we reach last row, we got the ans, means able to place Q till end
        if (row == n) {
            sol++;
            return;
        }

        // now check for each col for given row(argument in this function)
        for (int col = 0; col < n; col++) {
            // mark current board position to TRUE, then check if it is valid place,
            // by recursively calling IsValid function on each position,
            // if it is not will backtrack and come back to this position, and mark is FALSE
            board[row][col] = true;

            // recursive call to check each position is valid
            if (isValid(board, n, row, col)) {
                // if this row is valid for next row till end for this way
                fun(ans, board, n, row + 1);
            }
            // if not valid backtrack and mark this position FALSE
            board[row][col] = false;
        }
    }

    public boolean isValid(boolean[][] board, int n, int row, int col) {
        // for loop check horizontal and vertical row, col
        for (int i = 0; i < n; i++) {
            // check each col -> (Q placed position) and (board row is same, each col)
            if (i != col && board[row][i]) {
                return false;
            }

            // check each row and that current same place
            // row changes, col is same
            if (i != row && board[i][col]) {
                return false;
            }
        }

        // now to check cross line

        int tr = row + 1, tc = col + 1; // i+1,j+1
        while (tr < n && tc < n) {
            if (board[tr][tc]) {
                return false;
            }
            tr++;
            tc++;
        }

        // i-1, j-1
        tr = row - 1;
        tc = col - 1;
        while (tr >= 0 && tc >= 0) {
            if (board[tr][tc]) {
                return false;
            }
            tr--;
            tc--;
        }

        // i-1, j+1
        tr = row - 1;
        tc = col + 1;
        while (tr >= 0 && tc < n) {
            if (board[tr][tc]) {
                return false;
            }
            tr--;
            tc++;
        }

        // i+1, j-1
        tr = row + 1;
        tc = col - 1;
        while (tr < n && tc >= 0) {
            if (board[tr][tc]) {
                return false;
            }
            tr++;
            tc--;
        }
        return true;
    }

}