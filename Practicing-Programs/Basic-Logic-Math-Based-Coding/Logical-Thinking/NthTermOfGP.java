//29. Find the nth term of a geometric progression (GP). 

import java.util.Scanner;

public class NthTermOfGP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter common ratio (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter term number (n): ");
        int n = sc.nextInt();

        double nthTerm = a * Math.pow(r, n - 1);

        System.out.println("Nth term of the GP = " + nthTerm);
    }
}
