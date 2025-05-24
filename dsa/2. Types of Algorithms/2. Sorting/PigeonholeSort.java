import java.util.*;

public class PigeonholeSort {
    public static void pigeonholeSort(int[] array) {
        int min = Arrays.stream(array).min().orElse(Integer.MIN_VALUE);
        int max = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
        int range = max - min + 1;
        
        int[] pigeonholes = new int[range];
        
        for (int num : array) {
            pigeonholes[num - min]++;
        }
        
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (pigeonholes[i] > 0) {
                array[index++] = i + min;
                pigeonholes[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 7, 4, 6, 8, 9, 1, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        pigeonholeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
