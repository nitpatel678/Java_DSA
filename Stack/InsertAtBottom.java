import java.util.*;
public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n = sc.nextInt();
        System.out.println("Enter the element in the stack");
        Stack <Integer> s1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            s1.push(temp);
        }
        System.out.println("Enter the element you want to enter at the bottom of the stack");
        int a = sc.nextInt();
        System.out.println("Printing the stack before insertion");
        System.out.println(s1);
        
        // Initialize the second stack to add the element
        Stack <Integer> s2 = new Stack<Integer>();
        while (s1.size()>0) {
            s2.push(s1.pop());
        }
        s1.push(a);
        while (s2.size()>0) {
            s1.push(s2.pop());
        }
        System.out.println("Printing the stack after inserting");
        System.out.println(s1);

        // Close the scanner to free resources
        sc.close();
    }
}