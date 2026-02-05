//19. Find the maximum difference between any two elements in an array. 

import java.util.Scanner;

public class MaximumDifferenceInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < n; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        System.out.println("Maximum difference = " + maxDiff);
    }
}
