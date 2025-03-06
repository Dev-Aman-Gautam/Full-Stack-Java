import java.util.*;

public class ShellSort {
    // Method to perform Shell Sort
    public static void shellSort(int[] array) {
        int n = array.length;
        
        // Start with a large gap, then reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform an insertion sort on elements at gap distance
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {8, 3, 9, 1, 7, 0, 10, 2, 4, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
