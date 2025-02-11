import java.util.*;
public class DeleteNodeParameter {

    public static class Node {
        int data;
        Node next;
        Node ( int data ) {
            this.data = data;
        }
    }

    public static void RemoveParameter (Node Parameter){
        int temp = Parameter.next.data;
        Parameter.data = temp;
        Parameter.next = Parameter.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}