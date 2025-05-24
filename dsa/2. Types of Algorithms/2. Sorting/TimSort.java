import java.util.*;

public class TimSort {
    private static final int MIN_RUN = 32;

    public static void timSort(int[] array) {
        int n = array.length;
        
        // Sort individual subarrays of size MIN_RUN using insertion sort
        for (int i = 0; i < n; i += MIN_RUN) {
            insertionSort(array, i, Math.min(i + MIN_RUN - 1, n - 1));
        }
        
        // Merge sorted runs
        for (int size = MIN_RUN; size < n; size *= 2) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);
                if (mid < right) {
                    merge(array, left, mid, right);
                }
            }
        }
    }

    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);
        
        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 3, 8, 1, 9, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        timSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
