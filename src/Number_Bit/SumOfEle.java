package Number_Bit;

public class SumOfEle {
    public static void main(String[] args) {
        /*
         * Given an array input. Check if any pair(i,j) exists such that Ai + Aj = k, i
         * + j. Ai has distinct number.
         * Input = A = [5,3,9,2,1,6], k = 12
         * Output = true;
         */
        int[] input = { 5, 3, 9, 1, 6, 8 };
        int k = 12;
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        // System.out.println("max - " + max);
        boolean[] att = new boolean[max + 1];

        for (int i = 0; i < input.length; i++) {
            int indx = input[i];
            att[indx] = true;
        }
        for (int i = 0; i < input.length; i++) {
            int searchEle = k - input[i]; // to find Xor k ^ input[i]
            if (att[searchEle] == true) {
                System.out.println("true");
                return;
            }

        }
        System.out.println("false");

    }
}
