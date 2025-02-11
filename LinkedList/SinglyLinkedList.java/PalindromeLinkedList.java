import java.util.*;
public class PalindromeLinkedList {
  
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static boolean IsPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 1: Store values in an array
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
    
        // Step 2: Check if the array is a palindrome
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
    
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}