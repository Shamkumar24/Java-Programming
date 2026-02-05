//18. Print the sum of elements in a given range (prefix sum). 

import java.util.Scanner;

public class PrefixSumRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        // Step 2: Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Build prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 4: Read range
        System.out.print("Enter starting index (L): ");
        int L = sc.nextInt();

        System.out.print("Enter ending index (R): ");
        int R = sc.nextInt();

        // Step 5: Calculate range sum
        int sum;
        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1];
        }

        // Step 6: Print result
        System.out.println("Sum of elements in given range = " + sum);
    }
}
