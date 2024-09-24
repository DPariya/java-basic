package Array_2D;

import java.util.List;
import java.util.ArrayList;

public class Array_2D_flip_image {
    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        input.add(List.of(1, 1, 0));
        input.add(List.of(1, 0, 1));
        input.add(List.of(0, 0, 0));

        int n = input.size();

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(1 - input.get(i).get(n - j - 1));
            }
            ans.add(row);
        }
        System.out.println(ans);

    }
}
