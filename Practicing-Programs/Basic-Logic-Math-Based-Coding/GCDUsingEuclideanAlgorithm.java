//9. Find the greatest common divisor (GCD) of two numbers. 

import java.util.Scanner;

public class GCDUsingEuclideanAlgorithm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));
    }
}
