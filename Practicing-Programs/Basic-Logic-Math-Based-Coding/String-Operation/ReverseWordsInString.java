//2. Reverse Words in a String 

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split the string into words
        String[] words = str.split(" ");

        // Print words in reverse order
        System.out.print("Reversed words: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
