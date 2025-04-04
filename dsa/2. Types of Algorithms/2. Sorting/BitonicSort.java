import java.util.*;

public class BitonicSort {
    public static void bitonicSort(int[] array, int low, int length, boolean direction) {
        if (length > 1) {
            int mid = length / 2;
            bitonicSort(array, low, mid, true);
            bitonicSort(array, low + mid, mid, false);
            bitonicMerge(array, low, length, direction);
        }
    }

    public static void bitonicMerge(int[] array, int low, int length, boolean direction) {
        if (length > 1) {
            int k = length / 2;
            for (int i = low; i < low + k; i++) {
                if ((direction && array[i] > array[i + k]) || (!direction && array[i] < array[i + k])) {
                    int temp = array[i];
                    array[i] = array[i + k];
                    array[i + k] = temp;
                }
            }
            bitonicMerge(array, low, k, direction);
            bitonicMerge(array, low + k, k, direction);
        }
    }

    public static void sort(int[] array) {
        bitonicSort(array, 0, array.length, true);
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 8, 6, 2, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
