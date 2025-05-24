import java.util.*;

class HuffmanNode implements Comparable<HuffmanNode> {
    char character;
    int frequency;
    HuffmanNode left, right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = this.right = null;
    }

    HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
        this.character = '\0'; // Internal node
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}

class HuffmanCoding {
    private Map<Character, String> huffmanCodes;
    private HuffmanNode root;

    public HuffmanCoding(String data) {
        Map<Character, Integer> frequencyMap = buildFrequencyMap(data);
        PriorityQueue<HuffmanNode> minHeap = buildPriorityQueue(frequencyMap);
        this.root = buildHuffmanTree(minHeap);
        this.huffmanCodes = new HashMap<>();
        generateCodes(root, "");
    }

    private Map<Character, Integer> buildFrequencyMap(String data) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : data.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    private PriorityQueue<HuffmanNode> buildPriorityQueue(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> minHeap = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }
        return minHeap;
    }

    private HuffmanNode buildHuffmanTree(PriorityQueue<HuffmanNode> minHeap) {
        while (minHeap.size() > 1) {
            HuffmanNode left = minHeap.poll();
            HuffmanNode right = minHeap.poll();
            HuffmanNode merged = new HuffmanNode(left.frequency + right.frequency, left, right);
            minHeap.offer(merged);
        }
        return minHeap.poll();
    }

    private void generateCodes(HuffmanNode node, String code) {
        if (node == null) return;
        if (node.character != '\0') {
            huffmanCodes.put(node.character, code);
        }
        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }

    public String encode(String data) {
        StringBuilder encodedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            encodedData.append(huffmanCodes.get(c));
        }
        return encodedData.toString();
    }

    public String decode(String encodedData) {
        StringBuilder decodedData = new StringBuilder();
        HuffmanNode current = root;
        for (char bit : encodedData.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;
            if (current.character != '\0') {
                decodedData.append(current.character);
                current = root;
            }
        }
        return decodedData.toString();
    }

    public Map<Character, String> getHuffmanCodes() {
        return huffmanCodes;
    }
}

public class HuffmanMain {
    public static void main(String[] args) {
        String data = "this is an example for huffman encoding";
        HuffmanCoding huffman = new HuffmanCoding(data);
        String encodedData = huffman.encode(data);
        String decodedData = huffman.decode(encodedData);

        System.out.println("Original Data: " + data);
        System.out.println("Encoded Data: " + encodedData);
        System.out.println("Decoded Data: " + decodedData);
        System.out.println("Huffman Codes: " + huffman.getHuffmanCodes());
    }
}
