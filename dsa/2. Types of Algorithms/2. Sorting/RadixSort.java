import java.util.*;

public class RadixSort {
    // Method to perform Radix Sort
    public static void radixSort(int[] array) {
        int max = Arrays.stream(array).max().orElse(0);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(array, exp);
        }
    }

    private static void countingSortByDigit(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        // Count occurrences of each digit
        for (int num : array) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }
        
        // Compute cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (array[i] / exp) % 10;
            output[count[digit] - 1] = array[i];
            count[digit]--;
        }
        
        // Copy sorted elements back to original array
        System.arraycopy(output, 0, array, 0, n);
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
