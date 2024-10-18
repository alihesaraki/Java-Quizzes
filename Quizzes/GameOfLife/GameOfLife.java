package Quizzes.GameOfLife;

import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];

        // Read the input grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // Create a new board to store the updated state
        int[][] newBoard = new int[n][n];

        // Check the state of each cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int aliveNeighbors = countAliveNeighbors(board, n, i, j);

                // Game of Life rules
                if (board[i][j] == 1) { // Cell is alive
                    if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                        newBoard[i][j] = 0; // Dies
                    } else {
                        newBoard[i][j] = 1; // Stays alive
                    }
                } else { // Cell is dead
                    if (aliveNeighbors == 3) {
                        newBoard[i][j] = 1; // Becomes alive
                    } else {
                        newBoard[i][j] = 0; // Remains dead
                    }
                }
            }
        }

        // Print the new state of the grid
        System.out.println("New state of the grid after one iteration:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to count the number of alive neighbors
    private static int countAliveNeighbors(int[][] board, int n, int x, int y) {
        int count = 0;
        int[] directions = {-1, 0, 1}; // Neighbors: up, left, right, down

        for (int dx : directions) {
            for (int dy : directions) {
                if (dx == 0 && dy == 0) continue; // Skip the cell itself
                int newX = x + dx;
                int newY = y + dy;
                if (newX >= 0 && newX < n && newY >= 0 && newY < n && board[newX][newY] == 1) {
                    count++;
                }
            }
        }

        return count; // Return the count of alive neighbors
    }
}
