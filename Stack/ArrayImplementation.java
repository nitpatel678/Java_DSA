import java.util.*;

public class ArrayImplementation {

    public static class Stack {
        private int[] arr = new int[10];
        private int index = 0;

        void push(int x) {
            if (index >= arr.length) {
                System.out.println("Stack overflow");
                return;
            }
            arr[index++] = x;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[index - 1];
        }

        int pop() {
            if (index == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return arr[--index];
        }

        void display() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println(); // Newline for better formatting
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
