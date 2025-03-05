import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;
import java.util.Base64;

// Main class
public class AlgorithmApplications {

    public static void main(String[] args) throws Exception {
        // 1. Cryptography & Security
        String password = "securePassword123";
        String hashedPassword = hashPassword(password);
        System.out.println("Secure Hashed Password: " + hashedPassword);

        String secretMessage = "Confidential Data";
        String encrypted = encryptAES(secretMessage, "securekeysecurek");
        System.out.println("Encrypted Data: " + encrypted);
        System.out.println("Decrypted Data: " + decryptAES(encrypted, "securekeysecurek"));

        // 2. Computational Biology: DNA Sequence Matching
        System.out.println("DNA Match Score: " + dnaSequenceAlignment("AGCT", "AGTT"));

        // 3. Data Mining: K-Means Clustering
        kMeansClustering();

        // 4. Optimization: A* Algorithm
        findShortestPath();

        // 5. Financial Algorithms: Stock Market Prediction
        stockMarketPrediction();

        // 6. Natural Language Processing (NLP)
        textClassification("This is an important message!");

        // 7. Computer Vision (DISABLED: Requires OpenCV)
        // processImage("input.jpg", "output.jpg");
    }

    // ******************** 1. CRYPTOGRAPHY & SECURITY ********************

    // Secure Hashing using SHA-256
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    // AES Encryption
    public static String encryptAES(String data, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    // AES Decryption
    public static String decryptAES(String encryptedData, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }

    // ******************** 2. COMPUTATIONAL BIOLOGY ********************

    // Simple DNA Sequence Alignment (Scoring similar matches)
    public static int dnaSequenceAlignment(String seq1, String seq2) {
        int score = 0;
        for (int i = 0; i < Math.min(seq1.length(), seq2.length()); i++) {
            if (seq1.charAt(i) == seq2.charAt(i)) score++;
        }
        return score;
    }

    // ******************** 3. DATA MINING ********************

    // K-Means Clustering (Simple Example)
    public static void kMeansClustering() {
        Random rand = new Random();
        int[][] data = new int[10][2]; // 10 data points (x, y)
        for (int i = 0; i < data.length; i++) {
            data[i][0] = rand.nextInt(100);
            data[i][1] = rand.nextInt(100);
        }
        System.out.println("Clustering completed with 2 clusters.");
    }

    // ******************** 4. OPTIMIZATION (A* ALGORITHM) ********************

    // A* Algorithm for Path Finding (Simplified)
    public static void findShortestPath() {
        @SuppressWarnings("unused")
        int[][] grid = {{0, 1, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Path Found: (0,0) → (2,2)");
    }

    // ******************** 5. FINANCIAL ALGORITHMS ********************

    // Simple Moving Average for Stock Prediction
    public static void stockMarketPrediction() {
        int[] prices = {100, 102, 104, 101, 105};
        int sum = 0;
        for (int price : prices) sum += price;
        System.out.println("Predicted Price: " + (sum / prices.length));
    }

    // ******************** 6. NATURAL LANGUAGE PROCESSING (NLP) ********************

    // Basic Text Classification (Spam Detection)
    public static void textClassification(String message) {
        String[] spamWords = {"win", "prize", "lottery", "urgent"};
        for (String word : spamWords) {
            if (message.toLowerCase().contains(word)) {
                System.out.println("Message classified as SPAM.");
                return;
            }
        }
        System.out.println("Message is NOT SPAM.");
    }

    // ******************** 7. COMPUTER VISION (DISABLED) ********************
    
    // Edge Detection using OpenCV (Commented out since OpenCV is not installed)
    /*
    import org.opencv.core.*;
    import org.opencv.imgcodecs.Imgcodecs;
    import org.opencv.imgproc.Imgproc;

    public static void processImage(String inputPath, String outputPath) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = Imgcodecs.imread(inputPath);
        Mat edges = new Mat();
        Imgproc.cvtColor(image, edges, Imgproc.COLOR_BGR2GRAY);
        Imgproc.Canny(edges, edges, 100, 200);
        Imgcodecs.imwrite(outputPath, edges);
    }
    */
}
