import java.util.*;

public class Implementation {

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
        System.out.print(root.val + " ");
        displayTree(root.left);
        displayTree(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Using the constructor that takes an integer parameter
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
        System.out.println("Binary Tree:");
        displayTree(root);
        sc.close();
    }
}
