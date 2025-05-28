package Beginner.Array_2D;

import java.util.List;
import java.util.ArrayList;

public class Array_2D_diagonal_sum {
    public static void main(String[] args) {
        // Array_2D_1
        List<List<Integer>> input2 = new ArrayList<>();
        input2.add(List.of(1, 2, 3));
        input2.add(List.of(4, 5, 6));
        input2.add(List.of(7, 8, 9));
        int sum = 0;
        int n = input2.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += input2.get(i).get(j);
                }
            }
        }
        System.out.println("Diagonal Sum is : " + sum);
        // Another way
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            // to get [i][i] = 00,11,22,33
            sum2 += input2.get(i).get(i);
            if (i != n - i - 1) { // to get 03,12,21,30
                sum2 += input2.get(i).get(n - i - 1);
            }
        }
        System.out.println("Sum2 is : " + sum2);
    }
}
