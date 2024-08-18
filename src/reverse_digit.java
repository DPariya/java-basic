import java.util.Scanner;

public class reverse_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome : ");
        int rev = 0,d,n=8989;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }

    }
}
