import java.util.*;

public class PancakeSort {
    public static void pancakeSort(int[] array) {
        int n = array.length;
        for (int currentSize = n; currentSize > 1; currentSize--) {
            int maxIndex = findMaxIndex(array, currentSize);
            
            if (maxIndex != currentSize - 1) {
                flip(array, maxIndex);
                flip(array, currentSize - 1);
            }
        }
    }

    public static int findMaxIndex(int[] array, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void flip(int[] array, int k) {
        int i = 0;
        while (i < k) {
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            i++;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        System.out.println("Original array: " + Arrays.toString(arr));
        pancakeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
