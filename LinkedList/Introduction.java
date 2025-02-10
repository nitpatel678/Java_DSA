import java.util.*;
public class  Introduction {

    public static class Node {
        int data; // Value
        Node next ;     // Addres of next node

        Node (int data){
            this.data = data;     // Constructor
        }
    }

    // Function to traverse the linked list 
    public static void printList(Node head){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Function to display it recursively

    public static void recursivelyPrint(Node head){
        if (head==null) {
            return ;
        }
        System.out.println(head.data);
        recursivelyPrint(head.next);
        
        // To display in reverse
        // if (head==null) {
        //     return ;
        // }
        // recursivelyPrint(head.next);
        // System.out.println(head.data); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node x = new Node(5);
        Node y = new Node(45);
        Node z = new Node(43);
        Node w = new Node(54);
        x.next=y;
        y.next=z;
        z.next=w;

        printList(x);

        // To Print it recursively

        recursivelyPrint(x);

        // Close the scanner to free resources
        sc.close();
    }
}