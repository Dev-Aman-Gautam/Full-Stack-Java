import java.util.ArrayList;
import java.util.List;

public class NaiveStringMatching {
    
    public static List<Integer> naiveStringMatcher(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        List<Integer> occurrences = new ArrayList<>();
        
        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                occurrences.add(i);
            }
        }
        
        return occurrences;
    }
    
    public static void main(String[] args) {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        
        List<Integer> result = naiveStringMatcher(text, pattern);
        
        System.out.println("Pattern found at positions: " + result);
    }
}
