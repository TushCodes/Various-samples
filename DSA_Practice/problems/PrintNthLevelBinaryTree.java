package problems;

// Problem: Print Elements of Nth Level in Binary Tree
// Description: Write a function to print all elements at the nth level of a binary tree.
// Prerequisites: TreeNode class is already provided in the problems package.
// Instructions:
// - Implement the printNthLevel(TreeNode root, int n) method below.
// - The function should print all node values at the nth level (root is level 1).
// - A sample main method is provided for testing.

public class PrintNthLevelBinaryTree {
    /**
     * Prints all elements at the nth level of the binary tree rooted at 'root'.
     * @param root The root node of the binary tree.
     * @param n The level to print (root is level 1).
     */
    public void printNthLevel(TreeNode root, int n) { 
        // TODO: Implement this method
       if(root==null) return;
       if(n==1) System.out.println(root.val + " ");
       printNthLevel(root.left, n-1);
       printNthLevel(root.right, n-1);
    }

    public static void main(String[] args) {
        // Example tree: [1, 2, 3, 4, 5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        PrintNthLevelBinaryTree sol = new PrintNthLevelBinaryTree();
        System.out.print("Elements at level 3: ");
        sol.printNthLevel(root, 3); // User will implement logic
        System.out.println();
    }
}
