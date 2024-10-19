# Gol Poach Game

This program simulates a game where three players have two hands each, and one of the hands contains a "Gol" (ball) while the others are empty. The ball is initially in one of the hands of a player, and during the game, various moves are made that involve swapping hands within or between players. The objective is to track the hand that holds the ball after all the moves are made.

## Problem Statement

You are given the initial position of the ball and a series of moves that the players make. Each player has two hands, denoted as `L` (left) and `R` (right). Initially, the ball is in the left or right hand of a specific player. The players can make two types of moves:

1. **Hand Swap for a Single Player:**
    - A player swaps the contents of their left and right hands. For example, if the ball is in the left hand, it will move to the right hand after the swap.

2. **Hand Swap Between Two Players:**
    - A player swaps the contents of a hand with the corresponding hand of the next player. For example, player `k` can swap their left or right hand with the left or right hand of player `k+1`.

### Input Format

- The first line contains an integer `n` (1 ≤ n ≤ 100), the number of moves.
- The second line contains an integer `s` (1 ≤ s ≤ 3), representing the initial player holding the ball, and a character `x` (`L` or `R`), representing which hand (left or right) the ball is in.
- The next `n` lines contain one of the two types of moves:
    - Move type 1: `1 k`, where player `k` swaps their left and right hands.
    - Move type 2: `2 k x y`, where player `k` swaps hand `x` with hand `y` of player `k+1`. Here, `x` and `y` are either `L` or `R`.

### Output Format

- Print the number of the player who holds the ball at the end of the game, followed by the hand (`L` or `R`) that contains the ball.



### Explanation

1. Initially, player 2 has the ball in their right hand.
2. The first move swaps the hands of player 2, so the ball moves to their left hand.
3. The second move swaps the right hand of player 1 with the left hand of player 2. Since the ball was in the left hand of player 2, it is now in the right hand of player 1.
4. The third move swaps the left hand of player 2 with the right hand of player 3. However, the ball is already in player 1's hand, so this move does not affect the ball's position.

At the end of the game, player 1 holds the ball in their right hand.

## How to Run

1. Compile and run the Java code.
2. Provide the input according to the format specified.
3. The output will display the player number and the hand where the ball resides after all the moves.

### Notes

- The game involves only three players.
- The ball can only be swapped between the left and right hands within a player or between adjacent players.
