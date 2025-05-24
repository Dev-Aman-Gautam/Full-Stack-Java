import java.util.*;

class TagSort {
    public static int[][] tagSort(int[] arr) {
        int n = arr.length;
        int[][] taggedArray = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            taggedArray[i][0] = arr[i]; // Element value
            taggedArray[i][1] = i; // Original index
        }
        
        Arrays.sort(taggedArray, Comparator.comparingInt(a -> a[0]));
        
        int[] sortedArray = new int[n];
        int[] originalIndices = new int[n];
        
        for (int i = 0; i < n; i++) {
            sortedArray[i] = taggedArray[i][0];
            originalIndices[i] = taggedArray[i][1];
        }
        
        return new int[][]{sortedArray, originalIndices};
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[][] result = tagSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(result[0]));
        System.out.println("Original indices in sorted order: " + Arrays.toString(result[1]));
    }
}
