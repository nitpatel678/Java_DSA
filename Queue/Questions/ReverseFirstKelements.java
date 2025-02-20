import java.util.*;
public class ReverseFirstKelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);

        // Making stack to store the element 
        Stack<Integer> s = new Stack<Integer>();
        while (q.size()>0) {
            s.push(q.remove());
        }

        // Restoring and filling the elements

        while (s.size()>0) {
            q.add(s.pop());
        }

        // Reversed queue

        System.out.println(q);
        // Close the scanner to free resources
        sc.close();
    }
}