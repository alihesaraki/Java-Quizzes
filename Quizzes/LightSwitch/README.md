# Light Switch Change Counter

In this problem, we have a light that changes its state (from on to off and vice versa) with a toggle switch. You are given the status of the light over `n` consecutive seconds, where you need to determine how many times the light changed its state.

## Problem Statement

You will receive the number of seconds `n`, followed by `n` lines where each line contains either `1` (indicating the light is on) or `0` (indicating the light is off). Your task is to count the total number of times the light switched from on to off or off to on.

### Input

- The first line contains a single integer `n` (1 ≤ n ≤ 1000), representing the number of seconds.
- The following `n` lines contain an integer which is either `1` or `0`.

### Output

- Output a single integer that represents the number of times the light's state changed.


### Explanation

In the example above, the light changes its state as follows:
- From `1` to `0` (1 change)
- Remains `0` (no change)
- From `0` to `1` (2 changes)
- From `1` to `0` (3 changes)

Thus, the light switched its state a total of 3 times.

## Note

Make sure to handle the edge cases, such as when all inputs are the same or when `n` is at its minimum or maximum limits.
