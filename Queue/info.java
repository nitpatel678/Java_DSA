import java.util.*;

public class info {
    public static void main(String[] args) {
        // Initializing a Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();
        
        // Adding elements to the queue
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        // Printing the queue
        System.out.println("Queue before removal: " + q);

        // Removing the front element (FIFO)
        q.remove();

        // Printing the queue after removal
        System.out.println("Queue after removal: " + q);

        // Print out the first element
        System.out.println(q.element());
    }
}
