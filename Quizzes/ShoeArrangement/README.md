# Shoe Arrangement Problem

## Problem Statement

In a ceremony organized by a professor who recently returned from abroad, `n` guests are invited. Each guest has a left and a right shoe, and they place their left shoe at position `L[i]` and their right shoe at position `R[i]` in a shoe rack that has a total of 1009 houses (numbered from 1 to 1009).

The professor's friend wants to ensure that when the guests leave the ceremony, the left shoe of each guest is immediately to the left of their right shoe. In other words, if a right shoe is located at position `x`, the corresponding left shoe should be at position `x - 1`.

To achieve this desired arrangement, the friend can swap the contents of two adjacent houses in the shoe rack.

Your task is to determine the minimum number of operations required to arrange the shoes in the desired order.

## Input

- The first line contains a positive integer `t` (1 ≤ t ≤ 10^5), representing the number of scenarios.
- For each scenario:
    - The first line contains a positive integer `n` (1 ≤ n ≤ 5 × 10^5), representing the number of guests.
    - Each of the following `n` lines contains two integers `L[i]` and `R[i]` (1 ≤ L[i], R[i] ≤ 10^9), representing the positions of the left and right shoes of the i-th guest.

It is guaranteed that no two shoes occupy the same position.

## Output

For each scenario, output a single integer representing the minimum number of operations required to achieve the desired shoe arrangement.

