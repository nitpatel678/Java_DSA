import java.util.*;
public class stackpractice {

    public static class Stack{
        private static class Node {
            int data;
            Node next;
            Node ( int data ){
                this.data = data;
            }
        }
        private Node top = null;

        void push(int value){
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        int peek(Node head){
            if (top==null) {
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                int value = top.data;
                return value;
            }
        }
        
        int pop(){
            if (top==null) {
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                int value = top.data;
                top = top.next;
                return value;
            }
        }

        void display(){
            if (top==null) {
                System.out.println("Stack is empty");
            }
            Node temp = top;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}