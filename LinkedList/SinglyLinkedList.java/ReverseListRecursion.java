import java.util.*;
public class ReverseListRecursion{
    
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node ReverseArray(Node Head){
        if (Head.next == null) {
            return Head; 
        }
        ReverseArray(Head);
        Node newHead = ReverseArray(Head.next);
        Head.next.next = Head;
        Head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}