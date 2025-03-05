/*
 * Recursion and Dynamic Programming 🚀
 * -----------------------------------
 * Recursion and dynamic programming are two powerful techniques used in computer science to solve complex problems efficiently.
 * While they share similarities, they are distinct approaches with specific applications and considerations.
 */

 public class RecursionAndDynamicProgramming {

    /*
     * 1️⃣ Recursion
     * ------------
     * Recursion involves solving a problem by breaking it down into smaller instances of the same problem.
     * A recursive function typically has:
     * - Base Case: Defines the simplest possible case that doesn't require further recursion.
     * - Recursive Case: Defines how the function calls itself with smaller or simpler inputs.
     */

    // Example: Factorial Function using Recursion
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    /*
     * Characteristics of Recursion:
     * - Divide and Conquer: Recursion divides problems into smaller subproblems until they can be easily solved.
     * - Stack Usage: Recursion uses the call stack to manage function calls, which can lead to stack overflow errors for deep recursion.
     * - Time Complexity: Depends on the number of recursive calls and the work done in each call.
     * - Memory: Recursive calls consume more memory due to stack frames.
     */

    /*
     * 2️⃣ Dynamic Programming (DP)
     * ---------------------------
     * Dynamic programming is a method for solving complex problems by breaking them down into simpler overlapping subproblems.
     * It stores the results of these subproblems (usually in an array or table) to avoid redundant computations, improving time complexity.
     * 
     * Dynamic programming problems typically exhibit:
     * - Optimal Substructure: Solutions to larger problems can be constructed from solutions to smaller subproblems.
     * - Overlapping Subproblems: Solutions to the same subproblem are reused multiple times in the computation.
     */

    // Example: Fibonacci Sequence using Dynamic Programming (Bottom-Up Approach)
    public static int fibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    /*
     * Characteristics of Dynamic Programming:
     * - Memoization: Stores results of subproblems to avoid redundant calculations.
     * - Top-Down vs. Bottom-Up: DP can be implemented using memoization (top-down) or iteration (bottom-up).
     * - Time Complexity: Reduces time complexity by solving each subproblem only once.
     * - Space Complexity: May use additional space to store solutions to subproblems.
     */

    /*
     * Key Differences Between Recursion & Dynamic Programming:
     * -------------------------------------------------------
     * 1️⃣ Nature: Recursion is a problem-solving approach where functions call themselves, while DP optimizes recursive algorithms.
     * 2️⃣ Memory Usage: Recursion consumes more memory due to stack frames; DP uses additional space for storing solutions.
     * 3️⃣ Optimization: DP avoids redundant computations using memoization or tabulation.
     */

    /*
     * When to Use Each Technique:
     * --------------------------
     * - Recursion: Use when problems can be easily divided into smaller identical problems (e.g., tree traversal, factorial).
     * - Dynamic Programming: Use for optimization of problems with overlapping subproblems (e.g., Fibonacci, shortest path in a graph).
     */

    public static void main(String[] args) {
        // 1️⃣ Recursion Example - Factorial
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // 2️⃣ Dynamic Programming Example - Fibonacci
        int fibNumber = 6;
        System.out.println("Fibonacci number at position " + fibNumber + " is: " + fibonacci(fibNumber));
    }
}
