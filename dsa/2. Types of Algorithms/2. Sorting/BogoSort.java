import java.util.*;

public class BogoSort {
    public static void bogoSort(int[] array) {
        Random rand = new Random();
        while (!isSorted(array)) {
            shuffle(array, rand);
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] array, Random rand) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        bogoSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
