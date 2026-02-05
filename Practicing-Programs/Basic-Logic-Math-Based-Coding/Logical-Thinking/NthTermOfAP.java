//28. Find the nth term of an arithmetic progression (AP).

import java.util.Scanner;

public class NthTermOfAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first term, common difference and n
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter term number (n): ");
        int n = sc.nextInt();

        // Formula for nth term of AP
        int nthTerm = a + (n - 1) * d;

        System.out.println("Nth term of the AP = " + nthTerm);
    }
}
