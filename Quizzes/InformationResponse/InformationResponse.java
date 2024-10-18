package Quizzes.InformationResponse;

import java.util.Scanner;

public class InformationResponse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number n
        int n = scanner.nextInt();

        // Build Morteza's response
        StringBuilder response = new StringBuilder("W"); // Start with 'W'

        // Append 'o' n times
        for (int i = 0; i < n; i++) {
            response.append("o");
        }

        // Append 'w!' at the end
        response.append("w!");

        // Print the final response
        System.out.println(response.toString());

        scanner.close(); // Close the scanner
    }
}
