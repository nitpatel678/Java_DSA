import java.util.*;
public class ReverseStack { 

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int temp = s.pop();
        reverse(s);
        pushBottom(s, temp);
    }
    
    private static void pushBottom(Stack<Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return;
        }
        int temp = s.pop();
        pushBottom(s, val);
        s.push(temp);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        System.out.println("Enter the element in the stack");
        Stack <Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        System.out.println("Printing before reversing");
        System.out.println(s1);
        System.out.println("Printing after reversing");
        reverse(s1);
        System.out.println(s1);
        // Close the scanner to free resources
        sc.close();
    }
}