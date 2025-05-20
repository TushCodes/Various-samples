package problems;

// Problem: Size of Binary Tree
// Description: Write a function to find the size (number of nodes) of a binary tree.
// Prerequisites: TreeNode class is already provided in the root folder.
// Instructions:
// - Implement the size(TreeNode root) method below.
// - The function should return the total number of nodes in the tree.
// - You may use recursion or iteration.
// - A sample main method is provided for testing.

public class SizeOfBinaryTree {
    
    /**
     * Returns the size (number of nodes) of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The total number of nodes in the tree.
     */
    public int size(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    /**
     * Returns the number of elements (nodes) present in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The total number of elements in the tree.
     */
    public int numberOfElements(TreeNode root) {
        // TODO: Implement this method

        return 0;
    }

    /**
     * Returns the sum of all node values in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The sum of all node values in the tree.
     */
    public int sum(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    /**
     * Returns the maximum value among all nodes in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The maximum node value in the tree. If the tree is empty, returns Integer.MIN_VALUE.
     */

    public int maxValue(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    /**
     * Returns the minimum value among all nodes in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The minimum node value in the tree. If the tree is empty, returns Integer.MAX_VALUE.
     */
    public int minValue(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minValue(root.left), minValue(root.right)));
    }

    /**
     * Returns the product of all node values in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The product of all node values in the tree. If the tree is empty, returns 1.
     */
    public int product(TreeNode root) {
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    /**
     * Returns the number of levels (height) in the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The number of levels in the tree. An empty tree has 0 levels.
     */

    public int numberOfLevels(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return 0;
        return 1+Math.max(numberOfLevels(root.left), numberOfLevels(root.right));
    }

    /**
     * Returns the height of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @return The height of the tree. An empty tree has height 0.
     */
    public int height(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        // Example tree: [2, 4, 10, 6, 15, null, 11]
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(4);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(11);
        SizeOfBinaryTree sol = new SizeOfBinaryTree();
        System.out.println("Size: " + sol.size(root));
        System.out.println("Sum: " + sol.sum(root));
        System.out.println("Max: " + sol.maxValue(root));
        System.out.println("Min: " + sol.minValue(root));
        System.out.println("Product: " + sol.product(root));
        System.out.println("Levels: " + sol.numberOfLevels(root));
        System.out.println("Height: " + sol.height(root));
    }
}
