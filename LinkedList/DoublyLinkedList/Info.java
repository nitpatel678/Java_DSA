import java.util.*;

public class Info {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

    }

    // To Print the node

    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Function to print in reverse
    public static void printListRev(Node tail) {
        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.prev;
        }
    }

    // To print the the list if random node is given
    public static void printRandom(Node randomNode){
        Node temp = randomNode;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
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

        printList(a);
        printListRev(f);

        printRandom(c);
        // Close the scanner to free resources
        sc.close();
    }
}