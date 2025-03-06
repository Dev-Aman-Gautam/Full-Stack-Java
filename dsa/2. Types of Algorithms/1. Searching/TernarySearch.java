public class TernarySearch {
    
    // Method to perform Ternary Search
    public static int ternarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int third = (right - left) / 3;
        int mid1 = left + third;
        int mid2 = right - third;

        if (array[mid1] == target) {
            return mid1;
        }
        if (array[mid2] == target) {
            return mid2;
        }

        if (target < array[mid1]) {
            return ternarySearch(array, target, left, mid1 - 1);
        } else if (target > array[mid2]) {
            return ternarySearch(array, target, mid2 + 1, right);
        } else {
            return ternarySearch(array, target, mid1 + 1, mid2 - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        
        int result = ternarySearch(arr, target, 0, arr.length - 1);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
