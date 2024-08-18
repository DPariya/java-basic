import java.util.List;
import java.util.ArrayList;
public class Array_2D_1 {
    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        input.add(List.of(1,1,0));
        input.add(List.of(1,0,1));
        input.add(List.of(0,0,0));

        for(int i = 0; i < input.size(); i++){
            for(int j = 0; j < input.get(i).size(); j++){
                if(input.get(i).get(j) == 1){
                    input.get(i).set(j,0);
                }else{
                    input.get(i).set(j,0);
                }
            }
        }
        System.out.println(input);

    }
}
