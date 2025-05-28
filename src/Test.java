
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int n = mat.length;
        int m = mat[0].length;
        // System.out.println("n= "+n);
        // System.out.println("m= "+m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    markRow(i, mat, m);
                    markColumn(j, mat, n);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    private static void markRow(int i, int[][] mat, int m) {
        System.out.println("a = " + i);

        for (int j = 0; j < m; j++) {
            if ((mat[i][j] != 0)) {
                mat[i][j] = -1;
            }

        }

    }

    private static void markColumn(int j, int[][] mat, int n) {
        System.out.println("a = " + j);

        for (int i = 0; i < n; i++) {
            if ((mat[i][j] != 0)) {
                mat[i][j] = -1;
            }

        }

    }
}