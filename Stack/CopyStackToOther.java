import java.util.*;
public class CopyStackToOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> s1 = new Stack<>();
        System.out.println("Enter the size of the stack");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            s1.push(temp);
        }
        System.out.println("Printing the first array : ");
        System.out.println(s1);

        // Initialize the second stack
        Stack <Integer> s2 = new Stack<>();
        while (s1.size()>0) {
            s2.push(s1.pop());
        }
        // Initialize the third stack
        Stack <Integer> s3 = new Stack<>();
        while (s2.size()>0) {
            s3.push(s2.pop());
        }
        System.out.println("Printing the copied stack");
        System.out.println(s3);

        // Close the scanner to free resources
        sc.close();
    }
}