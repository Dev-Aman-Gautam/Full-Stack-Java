import java.util.*;

public class CountingSort {
    // Method to perform Counting Sort
    public static void countingSort(int[] array) {
        int n = array.length;
        int max = Arrays.stream(array).max().orElse(0);
        
        int[] count = new int[max + 1];
        int[] output = new int[n];
        
        // Count occurrences of each element
        for (int num : array) {
            count[num]++;
        }
        
        // Compute cumulative count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        
        // Copy sorted elements back to original array
        System.arraycopy(output, 0, array, 0, n);
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
