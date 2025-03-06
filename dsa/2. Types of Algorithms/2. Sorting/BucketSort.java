import java.util.*;

public class BucketSort {
    // Method to perform Bucket Sort
    @SuppressWarnings("unchecked")
    public static void bucketSort(float[] array, int numBuckets) {
        List<Float>[] buckets = new List[numBuckets];
        
        // Initialize buckets
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Distribute elements into buckets
        for (float num : array) {
            int bucketIndex = (int) (num * numBuckets);
            buckets[bucketIndex].add(num);
        }
        
        // Sort each bucket
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }
        
        // Concatenate buckets back to array
        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) {
                array[index++] = num;
            }
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        float[] arr = {0.42f, 0.32f, 0.33f, 0.52f, 0.37f, 0.47f, 0.51f};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        bucketSort(arr, 5);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
