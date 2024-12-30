
import java.util.*;

public class RatInMaze {
    /*
     * GeekForGeek
     * /problems/rat-in-a-maze-problem/1
     * Consider a rat placed at (0, 0) in a square matrix mat of order n* n.
     * It has to reach the destination at (n - 1, n - 1). Find all possible paths
     * that the rat can take to reach from source to destination. The directions
     * in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right).
     * Value 0 at a cell in the matrix represents that it is blocked and rat cannot
     * move to it while value 1 at a cell in the matrix represents that rat can be
     * travel through it.
     * Note: In a path, no cell can be visited more than one time.
     * If the source cell is 0, the rat cannot move to any other cell.
     * In case of no path, return an empty list. The driver will output "-1"
     * automatically.
     * Input: mat[][] = [[1, 0, 0, 0],
     * [1, 1, 0, 1],
     * [1, 1, 0, 0],
     * [0, 1, 1, 1]]
     * Output: DDRDRR DRDDRR
     */
    public static void main(String[] args) {
        // input
        int[][] mat = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };
        int n = mat.length;
        // create instance to call function
        RatInMaze rm = new RatInMaze();
        ArrayList<String> ans = new ArrayList<>();// store output
        rm.func(mat, ans, n, 0, 0, "");
        System.err.println(ans);
    }

    void func(int[][] mat, ArrayList<String> res, int n, int i, int j, String s) {
        if ((i == n - 1) && (j == n - 1)) { // reached to last element
            if (mat[i][j] == 1) { // last element is 1 (destination)
                res.add(s);
                return;
            }
        }

        // Check if array goes out of bound
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0) {
            return; // we just return from here, backtracking
        }
        // the whole process
        // 1. we make visited index 0
        mat[i][j] = 0;
        // 2. will go in each direction
        func(mat, res, n, i, j + 1, s + "R");
        func(mat, res, n, i - 1, j, s + "U");
        func(mat, res, n, i, j - 1, s + "L");
        func(mat, res, n, i + 1, j, s + "D");
        mat[i][j] = 1;
    }

}