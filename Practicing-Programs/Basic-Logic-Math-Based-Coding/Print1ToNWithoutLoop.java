// Program to print numbers from 1 to N without using loops (using recursion)

import java.util.Scanner;

public class Print1ToNWithoutLoop {

    static void printNumbers(int n) {
        if (n == 0) {
            return;   // base condition
        }
        printNumbers(n - 1);   // recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User notification
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
