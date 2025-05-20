package problems;

// Problem: Preorder Traversal of Binary Tree
// Description: Write a function to perform preorder traversal of a binary tree.
// Prerequisites: TreeNode class is already provided in the root folder.
// Instructions:
// - Implement the preorder(TreeNode root) method below.
// - The function should print or collect the values in preorder (root, left, right).
// - You may use recursion or iteration.
// - A sample main method is provided for testing.

public class PreorderTraversalBinaryTree {
    int size = 0;

    /**
     * Performs preorder traversal of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * // You may print the values or collect them in a list.
     */
    public void preorder(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return;
        System.out.print(root.val + " ");
        size++;
        preorder(root.left);
        preorder(root.right);
    }

    /**
     * Performs inorder traversal of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     */
    public void inorder(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    /**
     * Performs postorder traversal of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     */
    public void postorder(TreeNode root) {
        // TODO: Implement this method
        if(root==null) return;
        postorder(root.left); 
        postorder(root.right);
        System.out.println(root.val); 
    }

    public static void main(String[] args) {
        // Example tree: [1, 2, 3, 4, 5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.right = new TreeNode(8);
        PreorderTraversalBinaryTree sol = new PreorderTraversalBinaryTree();
        System.out.print("Preorder: ");
        sol.preorder(root); // Expected: 1 2 4 5 3
        System.out.println();
        System.out.println(sol.size);
        System.out.print("Inorder: ");
        sol.inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        sol.postorder(root);
        System.out.println();
    }
}
