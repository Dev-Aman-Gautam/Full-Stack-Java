import java.util.*;

public class ZAlgorithm {
    
    // Function to compute the Z-array
    public static int[] computeZArray(String s) {
        int n = s.length();
        int[] Z = new int[n];
        int left = 0, right = 0;
        
        for (int i = 1; i < n; i++) {
            if (i > right) {
                left = right = i;
                while (right < n && s.charAt(right) == s.charAt(right - left)) {
                    right++;
                }
                Z[i] = right - left;
                right--;
            } else {
                int k = i - left;
                if (Z[k] < right - i + 1) {
                    Z[i] = Z[k];
                } else {
                    left = i;
                    while (right < n && s.charAt(right) == s.charAt(right - left)) {
                        right++;
                    }
                    Z[i] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
    
    // Function to find pattern occurrences in the text
    public static List<Integer> searchPattern(String text, String pattern) {
        String combined = pattern + "#" + text;
        int[] Z = computeZArray(combined);
        List<Integer> result = new ArrayList<>();
        
        int patternLength = pattern.length();
        for (int i = patternLength + 1; i < Z.length; i++) {
            if (Z[i] == patternLength) {
                result.add(i - patternLength - 1);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String text = "abcpqrabc";
        String pattern = "abc";
        List<Integer> occurrences = searchPattern(text, pattern);
        System.out.println("Pattern found at indices: " + occurrences);
    }
}
