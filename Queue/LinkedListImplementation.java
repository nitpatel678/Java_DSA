public class LinkedListImplementation {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void enqueue(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int dequeue() {
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int value = head.data;
            head = head.next;
            size--;
            if (head == null) { // If queue becomes empty, reset tail as well
                tail = null;
            }
            return value;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.print();
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
        q.print();
    }
}
