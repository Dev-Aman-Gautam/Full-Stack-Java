class RabinKarp {
    static final int d = 256; // Base value for hash computation
    
    static void search(String pattern, String text, int q) {
        int m = pattern.length();
        int n = text.length();
        int i, j;
        int p = 0; // Hash value for pattern
        int t = 0; // Hash value for text
        int h = 1;

        // Compute the hash multiplier value h = (d^(m-1)) % q
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Compute the hash value of pattern and first window of text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern over the text
        for (i = 0; i <= n - m; i++) {
            // If hash values match, check characters one by one
            if (p == t) {
                boolean match = true;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match)
                    System.out.println("Pattern found at index " + i);
            }

            // Compute hash value for next window of text
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                // If t is negative, convert it to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABABCABABABCABAB";
        String pattern = "ABABC";
        int prime = 101; // A prime number for hashing
        search(pattern, text, prime);
    }
}
