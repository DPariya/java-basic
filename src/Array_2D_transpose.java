import java.util.ArrayList;
import java.util.List;

public class Array_2D_transpose {
    public static void main(String[] args) {
        /*List<List<Integer>> input = new ArrayList<>();
        input.add(List.of(1,2,3));
        input.add(List.of(4,5,6));
        input.add(List.of(7,8,9));
        input.add(List.of(10,11,12));
        System.out.println("INPUT" + input);

        int n = input.size();
        System.out.println("n "+n);
        int  m = input.getFirst().size();
        System.out.println("m "+m);

        // 1: make empty matrix of size n*m
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            //2: make row first
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                //3: add element into row, one by one
                row.add(input.get(j).get(i));
            }
            //4: now add that row to matrix
            result.add(row);
        }
        System.out.println("Transposed Array : " + result);
        */
        for(int i =0; i<10; i=i*8){
            System.out.println("i--",i);
        }


    }
}
