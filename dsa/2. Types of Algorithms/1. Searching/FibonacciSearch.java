public class FibonacciSearch {
    
    // Method to perform Fibonacci Search
    public static int fibonacciSearch(int[] array, int target) {
        int n = array.length;
        
        // Initialize Fibonacci numbers
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;
        
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }
        
        int offset = -1;
        
        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, n - 1);
            
            if (array[i] < target) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (array[i] > target) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else {
                return i;
            }
        }
        
        if (fibMMm1 == 1 && array[offset + 1] == target) {
            return offset + 1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int target = 85;
        
        int result = fibonacciSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
