public class CircularQueueImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularQueue {
        Node head = null;
        Node tail = null;
        int size = 0;
        int capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
        }

        public void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
                tail.next = head; // Circular link
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // Maintain circular link
            }
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = head.data;
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circular link
            }
            size--;
            return value;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public void print() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.print();

        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Front element: " + cq.peek());

        cq.enqueue(60);
        cq.print();
    }
}
