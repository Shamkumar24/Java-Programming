//8. Count the number of digits in a given number. 

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}
