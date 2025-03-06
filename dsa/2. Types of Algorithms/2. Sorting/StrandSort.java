import java.util.*;

public class StrandSort {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }
        
        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }
        
        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }
        
        return merged;
    }

    public static List<Integer> strandSort(List<Integer> array) {
        List<Integer> result = new ArrayList<>();
        
        while (!array.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            sublist.add(array.remove(0));
            
            Iterator<Integer> iter = array.iterator();
            while (iter.hasNext()) {
                int num = iter.next();
                if (num >= sublist.get(sublist.size() - 1)) {
                    sublist.add(num);
                    iter.remove();
                }
            }
            
            result = merge(result, sublist);
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 3));
        System.out.println("Original array: " + arr);
        List<Integer> sortedArr = strandSort(arr);
        System.out.println("Sorted array: " + sortedArr);
    }
}
