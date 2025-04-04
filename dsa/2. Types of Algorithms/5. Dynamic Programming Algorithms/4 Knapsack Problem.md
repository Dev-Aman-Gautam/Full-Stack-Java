# Knapsack Problem

The **Knapsack Problem** is a classic optimization problem in computer science and operations research. It involves selecting a subset of items with given weights and values to maximize the total value without exceeding a weight limit.

## Table of Contents

- [Knapsack Problem](#knapsack-problem)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Types of Knapsack Problems](#types-of-knapsack-problems)
    - [0/1 Knapsack Problem](#01-knapsack-problem)
      - [How It Works](#how-it-works)
      - [Pseudocode](#pseudocode)
      - [Time Complexity](#time-complexity)
      - [Applications](#applications)
    - [Fractional Knapsack Problem](#fractional-knapsack-problem)
      - [How It Works](#how-it-works-1)
      - [Pseudocode](#pseudocode-1)
      - [Time Complexity](#time-complexity-1)
      - [Applications](#applications-1)
    - [Multiple Knapsack Problem](#multiple-knapsack-problem)
      - [How It Works](#how-it-works-2)
      - [Pseudocode](#pseudocode-2)
      - [Time Complexity](#time-complexity-2)
      - [Applications](#applications-2)
    - [Bounded Knapsack Problem](#bounded-knapsack-problem)
      - [How It Works](#how-it-works-3)
      - [Pseudocode](#pseudocode-3)
      - [Time Complexity](#time-complexity-3)
      - [Applications](#applications-3)
    - [Unbounded Knapsack Problem](#unbounded-knapsack-problem)
      - [How It Works](#how-it-works-4)
      - [Pseudocode](#pseudocode-4)
      - [Time Complexity](#time-complexity-4)
      - [Applications](#applications-4)
  - [Dynamic Programming Approach](#dynamic-programming-approach)
    - [General Steps](#general-steps)
  - [Greedy Approach](#greedy-approach)
    - [General Steps](#general-steps-1)
  - [Example](#example)
  - [Time Complexity](#time-complexity-5)
  - [Applications](#applications-5)

## Introduction

The Knapsack Problem is about choosing a subset of items to include in a knapsack to maximize the total value while keeping the total weight under or equal to a given limit. It has various forms depending on the constraints of the problem.

## Types of Knapsack Problems

### 0/1 Knapsack Problem

In the 0/1 Knapsack Problem, each item can either be included or excluded from the knapsack (i.e., each item has a binary choice).

#### How It Works

1. **Initialization**:
   - Create a 2D DP table where `dp[i][w]` represents the maximum value achievable with the first `i` items and a knapsack capacity of `w`.

2. **DP Transition**:
   - For each item, decide whether to include it or exclude it, based on the maximum value achievable.

#### Pseudocode

```python
def knapsack_01(weights, values, capacity):
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for w in range(capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            else:
                dp[i][w] = dp[i - 1][w]
    
    return dp[n][capacity]
```

#### Time Complexity

- **Time Complexity**: \( O(n  imes W) \)
- **Space Complexity**: \( O(n  imes W) \)

#### Applications

- Budget management
- Resource allocation

### Fractional Knapsack Problem

In the Fractional Knapsack Problem, you can take fractional amounts of an item.

## How It Works

1. **Calculate Ratios**:
   - Compute the ratio of value to weight for each item.

2. **Greedy Selection**:
   - Sort items by this ratio in descending order and add items to the knapsack until it’s full.

#### Pseudocode

```python
def knapsack_fractional(weights, values, capacity):
    n = len(weights)
    items = [(values[i] / weights[i], weights[i], values[i]) for i in range(n)]
    items.sort(reverse=True, key=lambda x: x[0])
    
    total_value = 0.0
    for ratio, weight, value in items:
        if capacity >= weight:
            capacity -= weight
            total_value += value
        else:
            total_value += ratio * capacity
            break
    
    return total_value
```

#### Time Complexity

- **Time Complexity**: \( O(n \log n) \)
- **Space Complexity**: \( O(n) \)

#### Applications

- Investment decisions
- Resource distribution

## Dynamic Programming Approach

### General Steps

1. **Define State**:
   - Define the state based on subproblems and their solutions.

2. **State Transition**:
   - Define how to transition from one state to another.

3. **Base Cases**:
   - Define the initial conditions.

4. **Build the DP Table**:
   - Solve the problem iteratively using the DP table.

## Greedy Approach

### General Steps

1. **Calculate Ratios**:
   - Compute the ratio of value to weight for each item.

2. **Sort Items**:
   - Sort items based on the computed ratio.

3. **Select Items**:
   - Add items to the knapsack based on the sorted order until the knapsack is full.

## Time Complexity

| Problem Type          | Time Complexity| Space Complexity  |
|-----------------------|----------------|-------------------|
| 0/1 Knapsack          | O(n×W)         |      O(n×W)       |
| Fractional Knapsack   | O(n log n)     |      O(n)         |
| Multiple Knapsack     | O(n×m×W)       |      O(n×m×W)     |
| Bounded Knapsack      | O(n×W×Q)       |      O(W)         |
| Unbounded Knapsack    | O(n×W)         |      O(W)         |

## Applications

- **Resource Allocation**: Budget management, investment decisions.
- **Logistics and Planning**: Urban planning, transportation systems.
- **Finance**: Portfolio optimization, financial arbitrage.
