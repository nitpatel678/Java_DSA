import java.util.*;
public class diameterBinaryTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        // Constructor that initializes the value
        public Node(int val) {
            this.val = val;
        }

    }
    // Function to calculate the diameter of a binary tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int currentDiameter = height(root.left) + height(root.right) + 1;
        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }
    // Function to calculate the height of a binary tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}