import java.util.*;

public class SleepSort {
    public static void sleepSort(int[] array) {
        List<Integer> sortedList = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threads = new ArrayList<>();

        for (int num : array) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(num * 100);
                    synchronized (sortedList) {
                        sortedList.add(num);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sorted array: " + sortedList);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        sleepSort(arr);
    }
}
