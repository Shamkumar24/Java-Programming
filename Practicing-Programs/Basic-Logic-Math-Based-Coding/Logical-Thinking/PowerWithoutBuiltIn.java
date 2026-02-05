//30. Implement a function to compute power (a^b) without using built-in functions. 

import java.util.Scanner;

public class PowerOfNumber {

    // Function to compute power
    static int power(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();

        int ans = power(a, b);

        System.out.println("Result = " + ans);
    }
}
