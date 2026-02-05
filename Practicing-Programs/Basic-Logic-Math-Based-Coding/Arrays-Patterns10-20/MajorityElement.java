//20. Find the majority element in an array (element appearing more than N/2 times). 

import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Majority Element");
        }
    }
}
