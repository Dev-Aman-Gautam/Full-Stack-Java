import java.util.*;

public class SelectionSort {
    // Method to perform Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
