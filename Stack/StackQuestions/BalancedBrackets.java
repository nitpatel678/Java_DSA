import java.util.*;
public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<Character>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == '(') {
                s.push(c);
            }
            else {
                if (s.size()==0) {
                    return false;
                }
                else if(s.peek()=='('){
                    s.pop();
                }
            }
        }

        if (s.size()==0) {
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "((()()))";
        if (isBalanced(str)) {
            System.out.println("This string is balanced");
        }
        else{
            System.out.println("This string is not balanced");
        }
        // Close the scanner to free resources
        sc.close();
    }
}