//3. Print the first N Fibonacci numbers. 

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        if (n == 2) {
            System.out.println(0);
            System.out.println(1);
            return;
        }

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
