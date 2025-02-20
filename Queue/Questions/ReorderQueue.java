import java.util.*;
public class ReorderQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        Queue <Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q);
        // Assigning new stack
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i < q.size()/2; i++) {
            s.push(q.remove());
        }

        while (s.size()>0) {
            q.add(s.pop());
        }

        for (int i = 1; i < q.size()/2; i++) {
            s.push(q.remove());
        }

        System.out.println(q);
        // Close the scanner to free resources
        sc.close();
    }
}