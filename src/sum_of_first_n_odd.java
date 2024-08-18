import java.util.Scanner;

public class sum_of_first_n_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Get sum of first odd number: ");
        int num = sc.nextInt();
        /* int sum=0;
        for(int i = 1; i <= 2* num -1; i+=2) {//odd sum = i =1, even i =2
            System.out.println(i);
            sum+=i;
        }
        System.out.println("sum == "+sum);*/

        // above is good code, but not best approach
        // use arithmetic propagation, USE MATH
        // you can get sum just by n*n
        // n = 2 : 1+3 = 4
        // n = 5 : 1+3+5+7+9 = 25
        // n = 9 : 1+3+5+7+9+11+13+15+17 : 81
        System.out.println("n*n = " + (num*num)  +  " is sum of first " + num + " odd numbers" );
    }
}
