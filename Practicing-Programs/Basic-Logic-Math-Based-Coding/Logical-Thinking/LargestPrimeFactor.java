//26. Find the largest prime factor of a given number. 

import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestPrime = -1;

        // Divide by 2 until possible
        while (n % 2 == 0) {
            largestPrime = 2;
            n = n / 2;
        }

        // Check odd factors
        for (int i = 3; i <= n; i = i + 2) {
            while (n % i == 0) {
                largestPrime = i;
                n = n / i;
            }
        }

        System.out.println("Largest prime factor = " + largestPrime);
    }
}
