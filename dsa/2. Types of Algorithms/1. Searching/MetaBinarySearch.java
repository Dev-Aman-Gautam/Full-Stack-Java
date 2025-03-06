public class MetaBinarySearch {
    
    // Method to perform Meta Binary Search (finding first occurrence of target)
    public static int metaBinarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] >= target) {
                high = mid; // Move towards left side to find the first occurrence
            } else {
                low = mid + 1; // Move towards right side
            }
        }
        
        // Post-process to check if the element at low is the target
        if (array[low] == target) {
            return low;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        
        int result = metaBinarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("First occurrence of element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}