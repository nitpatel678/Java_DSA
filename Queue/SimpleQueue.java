// Array Implementation of Queue 
public class SimpleQueue {
    int front, rear, size;
    int[] arr;

    public SimpleQueue(int capacity) {
        arr = new int[capacity];
        front = rear = 0;
        size = capacity;
    }

    public void enqueue(int value) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear++] = value;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front++];
        return removed;
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Output: 10 20 30
        System.out.println("Removed: " + q.dequeue()); // Output: Removed: 10
        q.display(); // Output: 20 30
    }
}
