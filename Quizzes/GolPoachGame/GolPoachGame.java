package Quizzes.GolPoachGame;

public class GolPoachGame {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Read the number of moves
        int n = scanner.nextInt();

        // Read the initial position of the ball
        int player = scanner.nextInt();
        String hand = scanner.next();

        // Process each move
        for (int i = 0; i < n; i++) {
            int moveType = scanner.nextInt();
            if (moveType == 1) {
                // Swap the hands of player k
                int k = scanner.nextInt();
                if (player == k) {
                    hand = hand.equals("L") ? "R" : "L"; // Swap hands of the same player
                }
            } else if (moveType == 2) {
                // Swap between player k and player k+1
                int k = scanner.nextInt();
                String x = scanner.next();
                String y = scanner.next();

                if (player == k && hand.equals(x)) {
                    player = k + 1;
                    hand = y;
                } else if (player == k + 1 && hand.equals(y)) {
                    player = k;
                    hand = x;
                }
            }
        }

        // Output the final position of the ball
        System.out.println(player + " " + hand);

        // Close the scanner
        scanner.close();
    }
}

