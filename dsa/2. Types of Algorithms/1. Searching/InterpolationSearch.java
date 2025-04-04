public class InterpolationSearch {
    
    // Method to perform Interpolation Search
    public static int interpolationSearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        
        while (low <= high && target >= array[low] && target <= array[high]) {
            if (low == high) {
                if (array[low] == target) return low;
                return -1;
            }
            
            // Calculate the probable position of the target
            int pos = low + ((target - array[low]) * (high - low) / (array[high] - array[low]));
            
            if (array[pos] == target) return pos;
            if (array[pos] < target) low = pos + 1;
            else high = pos - 1;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 70;
        
        int result = interpolationSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
