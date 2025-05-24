public class BinarySearch {
    
    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == target) {
                return mid; // Return index if target is found
            } else if (array[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42};
        int target = 25;
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
