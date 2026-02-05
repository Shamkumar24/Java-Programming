//16. Print a pyramid pattern of numbers. 

import java.util.Scanner;

public class FullNumberPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();   // next line
        }
    }
}
