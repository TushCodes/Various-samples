import java.util.Scanner;

class BinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

public class dsa {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary Tree Practice CLI");
        while (true) {
            System.out.println("1. Insert\n2. Inorder Traversal\n3. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value to insert: ");
                int val = sc.nextInt();
                tree.insert(val);
            } else if (choice == 2) {
                System.out.print("Inorder: ");
                tree.inorder();
                System.out.println();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}