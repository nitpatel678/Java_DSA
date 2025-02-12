import java.util.*;

public class PalindromeDoubly {
    public static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    // Function to print the list
    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Function to check if the list is a palindrome
    public static boolean isPalindrome(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Traverse the list and add data to array
        while (head != null) {
            arr.add(head.data);
            head = head.next;  // Missing update to head
        }

        int start = 0;
        int end = arr.size() - 1;

        // Compare elements from start and end
        while (start < end) {
            if (!arr.get(start).equals(arr.get(end))) { // Fixed comparison: arr.get(start) vs arr.get(end)
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create nodes
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);
        
        // Link nodes to create a doubly linked list
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

        // Check if the list is palindrome
        boolean ans = isPalindrome(a);
        System.out.println(ans);

        // Close the scanner to free resources
        sc.close();
    }
}
