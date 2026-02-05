//21. Check if a number is a perfect square. 

import java.util.Scanner;

public class CheckPerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a Perfect Square");
            return;
        }

        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}
