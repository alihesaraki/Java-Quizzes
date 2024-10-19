package Quizzes.LightSwitch;

import java.util.Scanner;

public class LightSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of seconds
        int n = scanner.nextInt();
        int previousState = -1; // Initialize previous state to an invalid state
        int changeCount = 0; // To count the number of changes

        // Read the states for each second
        for (int i = 0; i < n; i++) {
            int currentState = scanner.nextInt();
            if (currentState != previousState && previousState != -1) {
                // If current state is different from the previous state
                changeCount++;
            }
            previousState = currentState; // Update the previous state
        }

        // Output the number of changes
        System.out.println(changeCount);
        scanner.close();
    }
}
