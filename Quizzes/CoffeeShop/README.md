# Java Quiz - Coffee Shop Problem

## Problem Statement

A newly opened cafe is facing financial difficulties. The cafe has `n` customers, each with their own order. The orders consist of a mixture of espresso and milk with varying percentages. To keep the final volume of the drinks constant, we fill the remaining volume with water. For example, one customer might order a drink with 30% milk and 60% espresso, filling the remaining 10% with water. Another customer might order a drink with 70% milk and 15% espresso, requiring 15% water.

Customers enter a queue in any order we choose, and we fulfill orders as long as we have the ingredients. Any customer whose order is fulfilled is happy, while those who do not receive their drinks are unhappy.

We want to determine the minimum amount of milk and coffee needed so that more than half of the customers are happy. If there are multiple ways to prepare the drinks, we should choose the one that minimizes the amount of milk required.

### Input
- The first line contains the integer `n`, the number of customers.
- The next `n` lines each contain two integers `a` and `b`, representing the percentage of milk and coffee required for each order.

Constraints:
- `1 ≤ n ≤ 100000`
- `0 ≤ a, b ≤ 100`
- `1 ≤ a + b ≤ 100`

### Output
- Print two integers `x` and `y`, representing the amount of initial milk and coffee needed, respectively. If there are multiple methods for preparation, consider the one that minimizes the amount of milk required.
