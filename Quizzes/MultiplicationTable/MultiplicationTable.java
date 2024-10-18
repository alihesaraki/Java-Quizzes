package Quizzes.MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number n
        int n = scanner.nextInt();

        // Generate and print the multiplication table
        for (int i = 1; i <= n; i++) { // Loop through numbers from 1 to n
            for (int j = 1; j <= n; j++) { // Loop through numbers from 1 to n for multiplication
                System.out.print(i * j + " "); // Print the product followed by a space
            }
            System.out.println(); // Move to the next line after printing all products for i
        }

        scanner.close(); // Close the scanner
    }
}
