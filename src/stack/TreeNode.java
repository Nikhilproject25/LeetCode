package src.stack;

import java.util.*;

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class with recursive inorder traversal
class Solution {
    private List<Integer> res = new ArrayList<>();
    int count=0;

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root != null) {

            traverse(root.left);         // Step 1: Visit left
            // Step 2: Visit current node
            traverse(root.right);
            count++;
            System.out.println(count);
            res.add(root.val);
            System.out.println(res);// Step 3: Visit right
        }
        return;
    }

    // Main method to test
    public static void main(String[] args) {
        /**
         * Build the following tree:
         *      1
         *       \
         *        2
         *       /
         *      3
         */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
    }
}
