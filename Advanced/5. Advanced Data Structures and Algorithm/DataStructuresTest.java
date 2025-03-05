import java.util.*;

// ===================== 1. Binary Search Tree (BST) =====================
class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    BinarySearchTree() {
        root = null;
    }

    BSTNode insert(BSTNode node, int key) {
        if (node == null) return new BSTNode(key);
        if (key < node.key) node.left = insert(node.left, key);
        else node.right = insert(node.right, key);
        return node;
    }
}

// ===================== 2. AVL Tree (Self-Balancing BST) =====================
class AVLNode {
    int key, height;
    AVLNode left, right;

    AVLNode(int d) {
        key = d;
        height = 1;
    }
}

class AVLTree {
    AVLNode root;

    int height(AVLNode N) {
        return (N == null) ? 0 : N.height;
    }

    AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    int getBalance(AVLNode N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    AVLNode insert(AVLNode node, int key) {
        if (node == null) return new AVLNode(key);
        if (key < node.key) node.left = insert(node.left, key);
        else node.right = insert(node.right, key);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) return rotateRight(node);
        if (balance < -1 && key > node.right.key) return rotateLeft(node);
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
}

// ===================== 3. Red-Black Tree =====================
enum Color { RED, BLACK; }

class RBNode {
    int data;
    Color color;
    RBNode left, right, parent;

    RBNode(int data) {
        this.data = data;
        this.color = Color.RED;
        left = right = parent = null;
    }
}

class RedBlackTree {
    private RBNode root;

    // Left Rotation
    void leftRotate(RBNode x) {
        RBNode y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    // Right Rotation
    void rightRotate(RBNode y) {
        RBNode x = y.left;
        y.left = x.right;
        if (x.right != null) x.right.parent = y;
        x.parent = y.parent;
        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;
        x.right = y;
        y.parent = x;
    }

    void insert(int data) {
        RBNode newNode = new RBNode(data);
        if (root == null) {
            root = newNode;
            root.color = Color.BLACK;
        } else {
            insertHelper(root, newNode);
        }
        fixInsert(newNode);
    }

    private void insertHelper(RBNode root, RBNode newNode) {
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
                newNode.parent = root;
            } else {
                insertHelper(root.left, newNode);
            }
        } else {
            if (root.right == null) {
                root.right = newNode;
                newNode.parent = root;
            } else {
                insertHelper(root.right, newNode);
            }
        }
    }

    private void fixInsert(RBNode k) {
        RBNode parent, grandparent;
        while (k.parent != null && k.parent.color == Color.RED) {
            parent = k.parent;
            grandparent = parent.parent;

            if (parent == grandparent.left) {
                RBNode uncle = grandparent.right;
                if (uncle != null && uncle.color == Color.RED) {
                    grandparent.color = Color.RED;
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    k = grandparent;
                } else {
                    if (k == parent.right) {
                        k = parent;
                        leftRotate(k);
                    }
                    parent.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    rightRotate(grandparent);
                }
            } else {
                RBNode uncle = grandparent.left;
                if (uncle != null && uncle.color == Color.RED) {
                    grandparent.color = Color.RED;
                    parent.color = Color.BLACK;
                    uncle.color = Color.BLACK;
                    k = grandparent;
                } else {
                    if (k == parent.left) {
                        k = parent;
                        rightRotate(k);
                    }
                    parent.color = Color.BLACK;
                    grandparent.color = Color.RED;
                    leftRotate(grandparent);
                }
            }
        }
        root.color = Color.BLACK;
    }
}

// ===================== 4. Graphs (BFS, DFS) =====================
class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];

    @SuppressWarnings("unchecked")
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) adjList[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    void BFS(int start) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

// ===================== 5. Main Class =====================
public class DataStructuresTest {
    public static void main(String[] args) {
        // ======================= 1. Binary Search Tree (BST) =======================
        System.out.println("\n===== Binary Search Tree (BST) =====");
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        System.out.println("BST Insertion Done!");

        // ======================= 2. AVL Tree =======================
        System.out.println("\n===== AVL Tree =====");
        AVLTree avl = new AVLTree();
        avl.root = avl.insert(avl.root, 10);
        avl.root = avl.insert(avl.root, 20);
        avl.root = avl.insert(avl.root, 30);
        avl.root = avl.insert(avl.root, 40);
        avl.root = avl.insert(avl.root, 50);
        System.out.println("AVL Tree Balanced Insertion Done!");

        // ======================= 3. Red-Black Tree =======================
        System.out.println("\n===== Red-Black Tree =====");
        RedBlackTree rbt = new RedBlackTree();
        rbt.insert(20);
        rbt.insert(15);
        rbt.insert(25);
        rbt.insert(10);
        rbt.insert(5);
        System.out.println("Red-Black Tree Implemented!");

        // ======================= 4. Graph (BFS & DFS) =======================
        System.out.println("\n===== Graph BFS & DFS =====");
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        System.out.print("BFS Traversal: ");
        graph.BFS(0);
        System.out.println();

        // ======================= 5. MinHeap & MaxHeap =======================
        System.out.println("\n===== MinHeap & MaxHeap =====");
        MinHeap minHeap = new MinHeap();
        minHeap.insert(3);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(5);
        System.out.println("MinHeap Extract Min: " + minHeap.extractMin());

        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(3);
        maxHeap.insert(1);
        maxHeap.insert(6);
        maxHeap.insert(5);
        System.out.println("MaxHeap Extract Max: " + maxHeap.extractMax());

        // ======================= 6. Sorting Algorithms =======================
        System.out.println("\n===== Sorting Algorithms =====");
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));
        SortingAlgorithms.bubbleSort(arr);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));
    }
}
