import java.util.*;
public class IntersectionOfTwoList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node IntersectionOfList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        int length1 = 0;
        int length2 = 0;
        while (temp1!=null) {
            length1++;
            temp1 = temp1.next;
        }
        while (temp2!=null) {
            length2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;

        if (length1>length2) {
            int steps = length1-length2;
            for (int i = 0; i < steps; i++) {
                temp1 = temp1.next;
            }
        }
        else{
            int steps = length2-length1;
            for (int i = 0; i < steps; i++) {
                temp1 = temp2.next;
            }
        }

        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}