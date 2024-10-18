package Quizzes.EyeToEyePairs;

import java.util.Scanner;

public class EyeToEyePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first row of seats
        int[] row1 = new int[8];
        for (int i = 0; i < 8; i++) {
            row1[i] = scanner.nextInt(); // 0 or 1 for each seat in row 1
        }

        // Read the second row of seats
        int[] row2 = new int[8];
        for (int i = 0; i < 8; i++) {
            row2[i] = scanner.nextInt(); // 0 or 1 for each seat in row 2
        }

        int eyeToEyeCount = 0; // Counter for eye-to-eye pairs

        // Calculate the number of eye-to-eye pairs
        for (int i = 0; i < 8; i++) {
            if (row1[i] == 1 && row2[i] == 1) {
                eyeToEyeCount++; // Both seats are occupied
            }
        }

        // Print the result
        System.out.println(eyeToEyeCount);
        scanner.close(); // Close the scanner
    }
}

