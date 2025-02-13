import java.util.*;
public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        st.push(56);
        st.push(56);
        st.push(57);
        st.push(78);
        // Close the scanner to free resources
        // peek
        System.out.println(st.peek());
        // printing the stack
        System.out.println(st);
        // pop operation
        st.pop();
        System.out.println(st);
        // to get the size 
        st.size();
        
        sc.close();
    }
}