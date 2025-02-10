import java.util.*;

public class InsertAtBeg {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Predefined user-defined linked list like ArrayList
    public static class linkedList {
        Node head = null;
        Node tail = null;

        // Insert at Beginning
        void insertAtBeg(int val) {
            Node temp = new Node(val); // Create new node
            if (head == null) { // If the list is empty
                head = temp;
                tail = temp;
            } else {
                temp.next = head; // New node points to the current head
                head = temp; // Update head to the new node
            }
        }

        // Insert at End
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Insert at Index
        void insertAt(int index, int val) {
            if (index < 0) {
                System.out.println("Invalid index!");
                return;
            }

            Node temp = new Node(val);

            // Insert at beginning (Special Case)
            if (index == 0) {
                temp.next = head;
                head = temp;
                if (tail == null) { // If list was empty
                    tail = temp;
                }
                return;
            }

            Node current = head;
            int i = 0;

            // Traverse to the (index-1)th node
            while (current != null && i < index - 1) {
                current = current.next;
                i++;
            }

            // If index is out of bounds
            if (current == null) {
                System.out.println("Index out of bounds!");
                return;
            }

            // Insert the new node
            temp.next = current.next;
            current.next = temp;

            // If inserted at the end, update tail
            if (temp.next == null) {
                tail = temp;
            }
        }

        // Delete at Index
        void deleteAt(int index) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (index < 0) {
                System.out.println("Invalid index!");
                return;
            }

            // Special case: delete first node
            if (index == 0) {
                head = head.next;
                if (head == null) { // If list becomes empty
                    tail = null;
                }
                return;
            }

            Node current = head;
            int i = 0;

            // Traverse to (index-1)th node
            while (current.next != null && i < index - 1) {
                current = current.next;
                i++;
            }

            // If index is out of bounds
            if (current.next == null) {
                System.out.println("Index out of bounds!");
                return;
            }

            // Delete the node
            current.next = current.next.next;

            // If last node was deleted, update tail
            if (current.next == null) {
                tail = current;
            }
        }

        // Display Linked List
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        linkedList list = new linkedList();

        // Insert nodes at end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Linked List after inserting at End:");
        list.display();

        // Insert at beginning
        list.insertAtBeg(5);
        list.insertAtBeg(1);

        System.out.println("Linked List after inserting at Beginning:");
        list.display();

        // Insert at specific index
        list.insertAt(2, 15); // Insert 15 at index 2
        System.out.println("After inserting 15 at index 2:");
        list.display();

        // Deleting node at index 2
        list.deleteAt(2);
        System.out.println("After deleting node at index 2:");
        list.display();

        // Deleting first node
        list.deleteAt(0);
        System.out.println("After deleting first node:");
        list.display();

        // Deleting last node
        list.deleteAt(3);
        System.out.println("After deleting last node:");
        list.display();

        // Trying to delete out-of-bounds index
        list.deleteAt(10);
        System.out.println("After trying to delete at index 10:");
        list.display();

        sc.close();
    }
}
