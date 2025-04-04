public class JumpSearch {
    
    // Method to perform Jump Search
    public static int jumpSearch(int[] array, int target) {
        int n = array.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        // Jumping ahead by step size
        while (prev < n && array[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }

        // Linear search within the block
        while (prev < n && array[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // If the target is found
        if (prev < n && array[prev] == target) {
            return prev;
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 13;
        
        int result = jumpSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
