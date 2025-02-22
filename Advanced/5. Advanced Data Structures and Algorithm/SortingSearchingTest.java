// Advanced Data Structures and Algorithms Implementation

import java.util.*;

// Binary Search Tree (BST) Implementation
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

// Red-Black Tree Placeholder (Implementation can be added)
class RedBlackTree {
    // Red-Black Tree logic can be implemented here
}

// Graph Implementation using Adjacency List
class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    
    @SuppressWarnings("unchecked")
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
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
    
    void DFSUtil(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
    
    void DFS(int start) {
        boolean visited[] = new boolean[vertices];
        DFSUtil(start, visited);
    }
}

// Heap Implementation
class MinHeap {
    private PriorityQueue<Integer> minHeap;
    
    MinHeap() {
        minHeap = new PriorityQueue<>();
    }
    
    void insert(int value) {
        minHeap.add(value);
    }
    
    int extractMin() {
        return minHeap.poll();
    }
}

class MaxHeap {
    private PriorityQueue<Integer> maxHeap;
    
    MaxHeap() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    void insert(int value) {
        maxHeap.add(value);
    }
    
    int extractMax() {
        return maxHeap.poll();
    }
}

// Sorting Algorithms
class SortingAlgorithms {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = Arrays.copyOfRange(arr, left, mid + 1);
        int R[] = Arrays.copyOfRange(arr, mid + 1, right + 1);
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

// Main Class to Test Implementations
public class SortingSearchingTest {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));
        SortingAlgorithms.bubbleSort(arr);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));
    }
}
