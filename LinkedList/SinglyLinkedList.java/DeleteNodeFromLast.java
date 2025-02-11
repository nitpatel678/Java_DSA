import java.util.*;

public class DeleteNodeFromLast {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node RemoveNodeFromLast(Node head, int pos) {
        if (head == null) {
            return null;
        }
    
        // Step 1: Find the size of the linked list
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
    
        // Step 2: Find the position from the start
        int indexFromStart = size - pos;
    
        // If the node to remove is the head
        if (indexFromStart == 0) {
            return head.next; // Remove the head node
        }
    
        // Step 3: Traverse to the node just before the one to be deleted
        temp = head;
        for (int i = 0; i < indexFromStart - 1; i++) {
            temp = temp.next;
        }
    
        // Step 4: Remove the node by skipping it
        temp.next = temp.next.next;
    
        return head;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}