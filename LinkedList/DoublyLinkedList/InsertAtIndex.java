import java.util.*;
public class InsertAtIndex {

    public static class Node {
        int data;
        Node prev;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    // Function to print the list 
    public static void print(Node head){
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Function to insert at index of the list 
    public static void insert(Node head, Node insert,  int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        insert.next = temp.next;       // Point new node's next to the current node's next
        if (temp.next != null) {
            temp.next.prev = insert;   // Point the current node's next node's prev to the new node
        }
        temp.next = insert;            // Point the current node's next to the new node
        insert.prev = temp;            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.prev = d;
        e.next = f;
        f.prev = e;
        Node g = new Node(69);
        insert(a, g,  4);
        // Print the list
        print(a);
        // Close the scanner to free resources
        sc.close();
    }
}