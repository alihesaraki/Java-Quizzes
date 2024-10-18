package Quizzes.PascalsTriangle;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number n
        int n = scanner.nextInt();

        // Create a 2D array to hold the triangle values
        int[][] triangle = new int[n][n];

        // Generate Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // First and last values in each row are always 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Fill in the values for the current row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the values in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            // Move to the next line after printing a row
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}
