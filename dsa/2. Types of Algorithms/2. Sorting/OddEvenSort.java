import java.util.*;

class OddEvenSort {
    public static void oddEvenSort(int[] arr) {
        boolean sorted = false;
        int n = arr.length;
        while (!sorted) {
            sorted = true;
            // Odd phase
            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
            // Even phase
            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        oddEvenSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

class BrickSort {
    public static void brickSort(int[] arr) {
        boolean sorted = false;
        int n = arr.length;
        while (!sorted) {
            sorted = true;
            // Odd phase
            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
            // Even phase
            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        brickSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

