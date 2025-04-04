public class SentinelLinearSearch {
    
    // Method to perform sentinel linear search
    public static int sentinelLinearSearch(int[] array, int target) {
        int n = array.length;
        int last = array[n - 1]; // Store the last element
        array[n - 1] = target; // Place the sentinel
        int index = 0;

        while (array[index] != target) {
            index++;
        }

        array[n - 1] = last; // Restore the last element

        if (index < n - 1 || array[n - 1] == target) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {34, 7, 23, 32, 5, 62};
        int target = 23;
        
        int result = sentinelLinearSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
