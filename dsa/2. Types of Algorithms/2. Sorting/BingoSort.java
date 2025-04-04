import java.util.*;

public class BingoSort {
    // Method to perform Bingo Sort
    public static void bingoSort(int[] array) {
        if (array.length == 0) return;
        
        int bingo = Arrays.stream(array).min().getAsInt();
        int largest = Arrays.stream(array).max().getAsInt();
        int nextBingo = largest;
        int nextPos = 0;
        
        while (bingo < nextBingo) {
            int startPos = nextPos;
            
            for (int i = startPos; i < array.length; i++) {
                if (array[i] == bingo) {
                    int temp = array[nextPos];
                    array[nextPos] = array[i];
                    array[i] = temp;
                    nextPos++;
                } else if (array[i] < nextBingo) {
                    nextBingo = array[i];
                }
            }
            
            bingo = nextBingo;
            nextBingo = largest;
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr = {5, 4, 8, 5, 4, 8, 5, 4, 4, 4};
        System.out.println("Original array: " + Arrays.toString(arr));
        bingoSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
