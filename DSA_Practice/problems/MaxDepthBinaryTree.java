// Problem: Maximum Depth of Binary Tree
// LeetCode-style starter
// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        // TODO: Implement this method
        return 0;
    }

    // You can add a main method to test your code
    public static void main(String[] args) {
        // Example: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaxDepthBinaryTree sol = new MaxDepthBinaryTree();
        System.out.println("Max Depth: " + sol.maxDepth(root)); // Expected: 3
    }
}
