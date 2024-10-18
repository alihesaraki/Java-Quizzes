# Eye-to-Eye Pairs in Metro Wagon

In a metro wagon, there are two rows of seats facing each other, with each row containing 8 seats. Each seat can either be empty (0) or occupied (1).

If a person is sitting on seat number `i`, they only look at the seat directly opposite them (seat number `i` in the opposite row). If that seat is also occupied, they will have an "eye-to-eye" interaction.

Your task is to determine the number of eye-to-eye pairs in a wagon given the seating arrangement.

## Input
- The first line contains 8 integers (0 or 1) representing the status of seats in the first row.
- The second line contains 8 integers (0 or 1) representing the status of seats in the second row.

## Output
- Output a single integer representing the number of eye-to-eye pairs.


## Explanation
In this example, the pairs are as follows:
- Seat 1 (row 1) looks at seat 1 (row 2) - no interaction.
- Seat 2 (row 1) looks at seat 2 (row 2) - interaction.
- Seat 3 (row 1) looks at seat 3 (row 2) - no interaction.
- Seat 4 (row 1) looks at seat 4 (row 2) - interaction.
- Seat 5 (row 1) looks at seat 5 (row 2) - no interaction.
- Seat 6 (row 1) looks at seat 6 (row 2) - no interaction.
- Seat 7 (row 1) looks at seat 7 (row 2) - interaction.
- Seat 8 (row 1) looks at seat 8 (row 2) - interaction.
