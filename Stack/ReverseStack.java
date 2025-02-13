import java.util.*;
public class ReverseStack { 

    public static void reverse(Stack<Integer> s){
        
    }
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
        // Close the scanner to free resources
        sc.close();
    }
}