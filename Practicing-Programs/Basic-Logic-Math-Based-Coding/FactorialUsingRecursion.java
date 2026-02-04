//7. Find the factorial of a number using recursion. 
import java.util.Scanner;

public class FactorialUsingRecursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base condition
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);
    }
}
