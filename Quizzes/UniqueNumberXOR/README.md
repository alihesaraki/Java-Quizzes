# Unique Number XOR

You are given a sequence of integers of length `n` in the form of
`a1, a2, ..., an, a1, a2, ..., an`, where no number appears more than twice in the sequence.

An integer is called "unique" if it appears only once in the sequence. Your task is to write a program that calculates the XOR of all unique numbers. If there are no unique numbers, print zero.

## Input
- A single integer `n` (1 ≤ n ≤ 100).
- A sequence of `2n` integers (each integer appears either once or twice).

## Output
- Print the XOR of all unique numbers. If there are no unique numbers, print `0`.



## Explanation
In the given sequence, the unique numbers are `1`, `4`, `7`, and `8`.
The XOR of these numbers is `4 ^ 7 ^ 1 ^ 8 = 12`.
