import java.util.*;

class StoogeSort {
    public static void stoogeSort(int[] arr, int start, int end) {
        if (arr[start] > arr[end]) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        if (end - start + 1 > 2) {
            int third = (end - start + 1) / 3;
            stoogeSort(arr, start, end - third);
            stoogeSort(arr, start + third, end);
            stoogeSort(arr, start, end - third);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        stoogeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
