import java.util.*;

public class CocktailSort {
    public static void cocktailSort(int[] array) {
        int n = array.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;
        
        while (swapped) {
            swapped = false;
            
            // Forward pass
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
            
            swapped = false;
            end--;
            
            // Reverse pass
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            
            start++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        cocktailSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
