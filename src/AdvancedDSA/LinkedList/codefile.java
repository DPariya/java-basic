package AdvancedDSA.LinkedList;

public class codefile {
    public static List<List<Integer>> solve(List<List<Integer>> input) {
        if (input == null || input.isEmpty())
            return;

        int m = input.size();
        int n = input.get(0).size();
        int col0 = 1;

        // 1st pass: Mark first row & column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (input.get(i).get(j) == 0) {
                    input.get(i).set(0, 0);
                }
                if (j != 0) {
                    input.get(0).set(j, 0);
                } else {
                    col0 = 0;
                }
            }
        }
        // mark 0 to remaining square
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                if (input.get(i).get(j) != 0) {

                    if (input.get(i).get(0) == 0 || input.get(0).get(j) == 0) {
                        input.get(i).set(j, 0);
                    }
                }
            }
        }
        // check 1st row/col to make it 0
        if (input.get(0).get(0) == 0) {
            // entire row 0
            for (int j = 0; j < n; j++) {
                input.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                input.get(i).set(0, 0);
            }
        }
        return input;
    }
}
