import java.util.*;
public class sizeMaxSum {
    static int size = 0;
    public static class Node {
        int val;
        Node left;
        Node right;

        // Constructor that initializes the value
        public Node(int val) {
            this.val = val;
        }

    }

    public static void displayTree(Node root) {
        if (root == null) {
            return;
        }
        size++;
        // System.out.print(root.val + " ");
        displayTree(root.left);
        displayTree(root.right);
    }


    // Function to calculate the maximum size of a binary tree
    public static int size (Node root){
        if (root==null){
            return 0;
            
        }
        return 1 + size(root.left) + size(root.right);
    }

    // Function to calculate the maximum sum of a binary tree
    public static int maxSum (Node root){
        if (root==null){
            return 0;
        }
        return root.val + maxSum(root.left) + maxSum(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        displayTree(root);
        System.out.println("Binary Tree size is " + size);

        // Close the scanner to free resources
        sc.close();
    }
}