import java.util.*;

public class CombSort {
    public static void combSort(int[] array) {
        int n = array.length;
        int gap = n;
        double shrink = 1.3;
        boolean sorted = false;
        
        while (!sorted) {
            gap = (int)(gap / shrink);
            if (gap <= 1) {
                gap = 1;
                sorted = true;
            }
            
            int i = 0;
            while (i + gap < n) {
                if (array[i] > array[i + gap]) {
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;
                    sorted = false;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 5, 9, 3, 7, 2, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        combSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}