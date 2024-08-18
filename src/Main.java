import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello world!");
        //System.out.println("Dipti Hiii!!!!");
       /* int n=25;
        int ans[] = new int[n/5];
        int k =0;
        for(int i=1;i<=n;i++){
           if(i%5==0){
               ans[k++]=i;
           }
        }
        System.out.println(Arrays.toString(ans));
        int num  = 130;
        System.out.println(num);
        byte b = (byte)num;
        System.out.println(b);*/
       /* System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Sum of a and b is "+(a+b));*/

        /*System.out.print("Enter no for table :");
        int n = sc.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(n + " + " + i + " = "+n*i);
        }*/
        // palindrome
        int a = 1771;
        //convert int to string
        String s = String.valueOf(a);
        char[] b = new char[s.length()];

//        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
            b[i] = s.charAt(i);
        }
       // System.out.println(Arrays.toString(b));
        System.out.println(b);



        ////sc.close(); // close so java's garbage collector can easily remove space occupied by those variables



    }
}