public class LCS {
    
    // Function to find the length of LCS using Dynamic Programming
    public static String findLCS(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] LCS = new int[m + 1][n + 1];

        // Fill the LCS table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;
                } else {
                    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
                }
            }
        }

        // Reconstruct the LCS string
        StringBuilder lcsString = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcsString.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (LCS[i - 1][j] > LCS[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcsString.reverse().toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCAB";
        String lcs = findLCS(X, Y);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
