package src.linkedlist;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution1 {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return maxDiameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) return 0;

        int left = calculateDepth(node.left);
        int right = calculateDepth(node.right);

        // Debug print for each node
        System.out.println("Node: " + node.val + ", Left Depth: " + left + ", Right Depth: " + right + ", Current Diameter: " + (left + right));

        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

    // Main method to build tree and call diameter method
    public static void main(String[] args) {
        // Building the tree: [1,2,3,4,5]
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        Solution1 sol = new Solution1();
        int diameter = sol.diameterOfBinaryTree(root);
        System.out.println("Diameter of Binary Tree: " + diameter);
    }
}

