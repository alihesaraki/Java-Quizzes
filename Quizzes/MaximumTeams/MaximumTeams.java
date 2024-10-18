package Quizzes.MaximumTeams;

import java.util.*;

public class MaximumTeams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of programmers
            Map<String, Integer> skillCount = new HashMap<>();
            // Initialize the skill count for each specialty
            skillCount.put("B", 0);
            skillCount.put("F", 0);
            skillCount.put("P", 0);

            // Read the specialties of each programmer
            for (int j = 0; j < n; j++) {
                String skills = scanner.next();
                // Update the count for each specialty
                if (skills.contains("B")) skillCount.put("B", skillCount.get("B") + 1);
                if (skills.contains("F")) skillCount.put("F", skillCount.get("F") + 1);
                if (skills.contains("P")) skillCount.put("P", skillCount.get("P") + 1);
            }

            // Calculate the maximum number of complete teams
            int completeTeams = Math.min(skillCount.get("B"), Math.min(skillCount.get("F"), skillCount.get("P")));

            // Print the result for the current test case
            System.out.println(completeTeams);
        }
        scanner.close(); // Close the scanner
    }
}
