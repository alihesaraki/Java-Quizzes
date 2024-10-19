package Quizzes.ShoeArrangement;

import java.util.Arrays;
import java.util.Scanner;

public class ShoeArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of scenarios

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of guests
            int[][] positions = new int[n][2]; // To store L and R positions

            for (int i = 0; i < n; i++) {
                positions[i][0] = scanner.nextInt(); // L[i]
                positions[i][1] = scanner.nextInt(); // R[i]
            }

            // Sort by R[i] first and if equal then by L[i]
            Arrays.sort(positions, (a, b) -> {
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            });

            int moves = 0;
            int currentL = Integer.MIN_VALUE; // To keep track of the last L position

            for (int[] pos : positions) {
                int L = pos[0];
                int R = pos[1];

                // If the current left shoe is not in the expected position (one less than R)
                if (currentL + 1 != R) {
                    moves += (R - (currentL + 1)); // Count moves needed to reach this position
                }
                currentL = L; // Update the last left shoe position
            }

            System.out.println(moves);
        }

        scanner.close();
    }
}

