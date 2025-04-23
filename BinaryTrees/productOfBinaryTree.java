import java.util.*;
public class productOfBinaryTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        // Constructor that initializes the value
        public Node(int val) {
            this.val = val;
        }

    }


    // Function to calculate the product of all nodes in a binary tree
    public static int product(Node root){
        if (root == null){
            return 1; // Return 1 for multiplication identity
            
        }
        return root.val*product(root.left)*product(root.right);
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

        System.out.println("Binary Tree product is " + product(root));

        // Close the scanner to free resources
        sc.close();
    }
}