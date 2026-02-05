//22. Check if a number is a power of 2. 

import java.util.Scanner;

public class CheckPowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }
    }
}
