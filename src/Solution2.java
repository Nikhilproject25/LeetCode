package src;

import java.util.ArrayList;
import java.util.List;

// TreeNode definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution2 {
    private List<Integer> res = new ArrayList<>(); // Class member to store results

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root); // Start recursive traversal
        return res; // Return the final result list
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return; // Base case: stop recursion if the node is null
        }
        traverse(root.left); // Recursively visit left subtree
        res.add(root.val);   // Add current node's value to the result
        traverse(root.right); // Recursively visit right subtree
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create a Solution instance and test inorderTraversal
        Solution2 solution = new Solution2();
        List<Integer> result = solution.inorderTraversal(root);

        // Print the result
        System.out.println(result); // Output: [1, 3, 2]
    }
}

