public class ExponentialSearch {
    
    // Method to perform Binary Search
    public static int binarySearch(int[] array, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == target) return mid;
            if (array[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
    
    // Method to perform Exponential Search
    public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) return 0;
        
        int n = array.length;
        int i = 1;
        while (i < n && array[i] <= target) {
            i = i * 2;
        }
        
        return binarySearch(array, target, i / 2, Math.min(i, n - 1));
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;
        
        int result = exponentialSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
