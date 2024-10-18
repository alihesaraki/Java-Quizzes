package Quizzes.UniqueNumberXOR;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueNumberXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number n
        int n = scanner.nextInt();

        // Create a map to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        // Read 2n numbers and count occurrences
        for (int i = 0; i < 2 * n; i++) {
            int num = scanner.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // Increment count
        }

        // Variable to hold the XOR of unique numbers
        int uniqueXOR = 0;

        // Calculate the XOR of unique numbers
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) { // Check if the number is unique
                uniqueXOR ^= entry.getKey(); // Perform XOR operation
            }
        }

        // Print the result (if no unique numbers, uniqueXOR will be 0)
        System.out.println(uniqueXOR);

        scanner.close(); // Close the scanner
    }
}
