# Maximum Teams Formation Problem

In a company, there are `n` programmers, each of whom specializes in one or more areas: Front-end (F), Back-end (B), or Product Management (P). The specialties of each person are provided as a string consisting of characters 'B', 'F', and 'P', sorted alphabetically.

The goal is to form the maximum number of complete teams. A complete team consists of at least one specialist in each of the three areas. Each person can be part of at most one team.

## Input
- The first line contains a positive integer `t`, the number of test cases.
    - `1 ≤ t ≤ 10000`
- For each test case:
    - The first line contains a positive integer `n`, the number of programmers.
        - `1 ≤ n ≤ 100`
    - The second line contains `n` strings separated by spaces, each representing the specialties of the i-th programmer.

## Output
- For each test case, output a single integer representing the maximum number of complete teams that can be formed.
