import java.util.*;

public class GnomeSort {
    public static void gnomeSort(int[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            if (i == 0 || array[i] >= array[i - 1]) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        gnomeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
