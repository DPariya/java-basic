package Beginner.Array_2D;

import java.util.Scanner;

//demo of 2D array
public class Array_2D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // STATIC 2D ARRAY
        int[][] a = new int[3][3];
        System.out.println("Enter 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        // update
        // a[2][3] = 20;

    }
}
