import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Is number Prime: ");
        // prime = number is divisible by only 1 and number itself
        // To check this, we will do reverse check, will check is this number is divisible by any number
        // from 2 to square of number
       /* int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i*i <= n; i++) { //note this square root of n
            if(n%i==0){ //it is divisible by i
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Number is prime" : "Number is not prime");*/

        int n =4;
        for(int i = 0; i<n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        for(int i = 0; i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        for(int i = 0; i<n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ---- 1D Array Problems ----- ");

        int[] nums = {1,2,3};
        int size = nums.length;
        System.out.println(size);
        int[] ans = new int[2*size];
        for(int i =0; i<size;i++){
            ans[i] = nums[i];
            ans[i+size] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--- Running sum --- ");

        int[] nums2 = {1,2,3,4};
        int size2 = nums2.length;
        int[] ans2 = new int[size2];
        ans2[0] = nums2[0];
        for(int i =1; i<size2;i++){
            ans2[i] = ans2[i-1]+nums2[i];
        }
        System.out.println(Arrays.toString(ans2));

    }
}
