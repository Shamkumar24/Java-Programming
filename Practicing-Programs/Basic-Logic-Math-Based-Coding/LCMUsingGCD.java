//10. Find the least common multiple (LCM) of two numbers. 

import java.util.Scanner;

public class LCMUsingGCD {

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

        int lcm = (a * b) / gcd(a, b);

        System.out.println("LCM = " + lcm);
    }
}
