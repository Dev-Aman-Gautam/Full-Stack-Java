import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class TreeSort {
    private TreeNode root;

    // Insert a value into the BST
    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    // In-order traversal to store sorted elements
    private void inOrderTraversal(TreeNode node, List<Integer> sortedList) {
        if (node != null) {
            inOrderTraversal(node.left, sortedList);
            sortedList.add(node.val);
            inOrderTraversal(node.right, sortedList);
        }
    }

    public void treeSort(int[] arr) {
        root = null;
        for (int num : arr) {
            root = insert(root, num);
        }
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedList.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 8, 6, 4};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        TreeSort sorter = new TreeSort();
        sorter.treeSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
