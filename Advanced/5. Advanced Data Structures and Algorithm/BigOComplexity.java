public class BigOComplexity {

    /*
     * Algorithm Complexity & Big O Notation (Easy Explanation with Examples) 🚀
     * Algorithm complexity helps us understand how an algorithm’s performance (speed & memory usage) changes as the input size grows.
     * Big O notation is used to describe the worst-case scenario of an algorithm’s time or space complexity.
     */

    // 1️⃣ Constant Time - O(1)
    // 👉 The algorithm takes the same time to execute, no matter how large the input is.

    // Example 1: Accessing an array element
    public static void constantTime() {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(arr[2]); // Always takes the same time
    }

    // Example 2: Checking if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 2️⃣ Logarithmic Time - O(log n)
    // 👉 The algorithm reduces the problem size by half in each step.
    // 💡 Used in binary search and balanced trees.

    // Example 1: Binary Search (Find a number in a sorted array)
    public static int binarySearch(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // 3️⃣ Linear Time - O(n)
    // 👉 The algorithm processes every element one by one.
    // 💡 Used in loops, searching, and basic operations.

    // Example 1: Finding an element in an array
    public static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    // 4️⃣ Linearithmic Time - O(n log n)
    // 👉 The algorithm splits the input into smaller parts and merges them back.
    // 💡 Used in efficient sorting algorithms like Merge Sort and Quick Sort.

    // Example 1: Merge Sort
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // 5️⃣ Quadratic Time - O(n²)
    // 👉 The algorithm has nested loops, making it slow for large inputs.
    // 💡 Used in Bubble Sort, Selection Sort, and Matrix operations.

    // Example 1: Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 6️⃣ Exponential Time - O(2ⁿ)
    // 👉 The algorithm doubles its work for each additional input.
    // 💡 Used in Recursive Fibonacci, Backtracking, and Brute-force algorithms.

    // Example 1: Fibonacci (Recursive)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 7️⃣ Factorial Time - O(n!)
    // 👉 The algorithm generates every possible combination.
    // 💡 Used in Traveling Salesman Problem, Permutations, and Combinatorial problems.

    // Example 1: Generating all permutations
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }

    // 8️⃣ Space Complexity Explanation
    /*
     * Space complexity refers to memory usage.
     * Examples:
     * O(1) → Uses fixed memory (e.g., swapping two variables).
     * O(n) → Stores all elements (e.g., recursion or extra arrays).
     * O(n²) → Uses a 2D matrix.
     */

    public static void main(String[] args) {
        // 1️⃣ O(1) - Constant Time Example
        constantTime();
        System.out.println("Is 10 even? " + isEven(10));

        // 2️⃣ O(log n) - Logarithmic Time Example
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int key = 50;
        System.out.println("\nO(log n) - Binary Search Example:");
        int index = binarySearch(arr, key);
        System.out.println("Element found at index: " + index);

        // 3️⃣ O(n) - Linear Search Example
        linearSearch(arr, key);

        // 4️⃣ O(n log n) - Merge Sort Example
        int sortArr[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(sortArr, 0, sortArr.length - 1);
        System.out.println("\nSorted array (Merge Sort): ");
        for (int num : sortArr) System.out.print(num + " ");

        // 5️⃣ O(n²) - Bubble Sort Example
        int bubbleArr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(bubbleArr);
        System.out.println("\nSorted array (Bubble Sort): ");
        for (int num : bubbleArr) System.out.print(num + " ");

        // 6️⃣ O(2ⁿ) - Exponential Fibonacci Example
        int fibNumber = 5;
        System.out.println("\n\nO(2ⁿ) - Fibonacci Example:");
        System.out.println("Fibonacci of " + fibNumber + " is: " + fibonacci(fibNumber));

        // 7️⃣ O(n!) - Factorial Permutation Example
        System.out.println("\nO(n!) - Generating all permutations of 'abc':");
        permute("abc", "");

        // 🔹 Real-Life Example
        System.out.println("\n🚀 Real-Life Example:");
        System.out.println("Using O(n) (Linear Search) → 1 million checks 😓");
        System.out.println("Using O(log n) (Binary Search in sorted files) → Only 20 checks! ✅");
    }
}
