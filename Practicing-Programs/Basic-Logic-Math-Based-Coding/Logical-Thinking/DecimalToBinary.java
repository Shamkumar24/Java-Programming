//23. Convert a decimal number to binary without using built-in functions.

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary = 0");
            return;
        }

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary; // prepend remainder
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}
