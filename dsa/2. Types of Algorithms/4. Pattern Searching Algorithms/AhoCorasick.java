import java.util.*;

class AhoCorasick {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        TrieNode failLink = null;
        List<String> output = new ArrayList<>();
    }

    private final TrieNode root;

    public AhoCorasick(List<String> patterns) {
        root = new TrieNode();
        buildTrie(patterns);
        buildFailureLinks();
    }

    private void buildTrie(List<String> patterns) {
        for (String pattern : patterns) {
            TrieNode node = root;
            for (char ch : pattern.toCharArray()) {
                node = node.children.computeIfAbsent(ch, k -> new TrieNode());
            }
            node.output.add(pattern);
        }
    }

    private void buildFailureLinks() {
        Queue<TrieNode> queue = new LinkedList<>();
        for (TrieNode child : root.children.values()) {
            child.failLink = root;
            queue.add(child);
        }

        while (!queue.isEmpty()) {
            TrieNode current = queue.poll();
            for (Map.Entry<Character, TrieNode> entry : current.children.entrySet()) {
                char ch = entry.getKey();
                TrieNode child = entry.getValue();
                queue.add(child);

                TrieNode failNode = current.failLink;
                while (failNode != null && !failNode.children.containsKey(ch)) {
                    failNode = failNode.failLink;
                }
                child.failLink = (failNode != null) ? failNode.children.get(ch) : root;
                child.output.addAll(child.failLink.output);
            }
        }
    }

    public List<String> search(String text) {
        List<String> results = new ArrayList<>();
        TrieNode node = root;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            while (node != null && !node.children.containsKey(ch)) {
                node = node.failLink;
            }
            if (node == null) {
                node = root;
                continue;
            }
            node = node.children.get(ch);
            for (String pattern : node.output) {
                results.add("Pattern '" + pattern + "' found at position " + (i - pattern.length() + 1));
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> patterns = Arrays.asList("he", "she", "his", "hers");
        String text = "ushers";

        AhoCorasick ac = new AhoCorasick(patterns);
        List<String> matches = ac.search(text);
        matches.forEach(System.out::println);
    }
}
