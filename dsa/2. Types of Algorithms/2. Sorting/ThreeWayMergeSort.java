import java.util.*;

public class ThreeWayMergeSort {
    // Method to perform 3-way Merge Sort
    public static void mergeSort3Way(int[] array) {
        if (array.length <= 1) return;
        
        int[] tempArray = Arrays.copyOf(array, array.length);
        mergeSort3WayRecursive(tempArray, 0, array.length - 1, array);
    }

    private static void mergeSort3WayRecursive(int[] array, int left, int right, int[] tempArray) {
        if (right <= left) return;
        
        int mid1 = left + (right - left) / 3;
        int mid2 = left + 2 * (right - left) / 3 + 1;
        
        mergeSort3WayRecursive(tempArray, left, mid1, array);
        mergeSort3WayRecursive(tempArray, mid1 + 1, mid2, array);
        mergeSort3WayRecursive(tempArray, mid2 + 1, right, array);
        
        merge(array, left, mid1, mid2, right, tempArray);
    }

    private static void merge(int[] array, int left, int mid1, int mid2, int right, int[] tempArray) {
        int i = left, j = mid1 + 1, k = mid2 + 1, l = left;
        
        while (i <= mid1 && j <= mid2 && k <= right) {
            if (tempArray[i] <= tempArray[j] && tempArray[i] <= tempArray[k])
                array[l++] = tempArray[i++];
            else if (tempArray[j] <= tempArray[i] && tempArray[j] <= tempArray[k])
                array[l++] = tempArray[j++];
            else
                array[l++] = tempArray[k++];
        }
        
        while (i <= mid1 && j <= mid2)
            array[l++] = (tempArray[i] <= tempArray[j]) ? tempArray[i++] : tempArray[j++];
        while (j <= mid2 && k <= right)
            array[l++] = (tempArray[j] <= tempArray[k]) ? tempArray[j++] : tempArray[k++];
        while (i <= mid1 && k <= right)
            array[l++] = (tempArray[i] <= tempArray[k]) ? tempArray[i++] : tempArray[k++];
        while (i <= mid1)
            array[l++] = tempArray[i++];
        while (j <= mid2)
            array[l++] = tempArray[j++];
        while (k <= right)
            array[l++] = tempArray[k++];
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {12, 2, 4, 2, 23, 8, 3, 14, 7, 5, 11, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort3Way(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
