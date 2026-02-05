//25. Check if three numbers can form a triangle. 

import java.util.Scanner;

public class CheckTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Can form a triangle");
        } else {
            System.out.println("Cannot form a triangle");
        }
    }
}
