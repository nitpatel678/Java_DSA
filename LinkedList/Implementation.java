import java.util.*;

public class Implementation {

    public static class Node {
        int data;
        Node next;
        Node ( int data){
            this.data = data;
        }
    }

    // Function to traverse the linked list 
    public static void printList(Node head){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }


    // Pre defined user defined linked list like arraylist 
    public static class linkedList{
        Node head = null;
        Node tail = null;
        
        // To insert the node 
        void insertAtEnd ( int val){
            Node temp = new Node(val);
            if (head==null) head = temp;
            else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList ll = new linkedList();
        ll.insertAtEnd(34);
        ll.insertAtEnd(56);
        ll.insertAtEnd(342);

        // To display it 
        ll.display();
        // Close the scanner to free resources
        sc.close();
    }
}
