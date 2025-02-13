import java.util.*;

public class LinkedListStack {

    public static class Stack {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top = null;

        void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack underflow");
                return -1;
            }
            return top.data;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack underflow");
                return -1;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.display();
        s.pop();
        s.display();
        sc.close();
    }
}
