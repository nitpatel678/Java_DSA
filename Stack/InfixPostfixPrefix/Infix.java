import java.util.*;
public class Infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            // 0->48 and 9->57
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48); // to get the real no minus 48
            } else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(c)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operation = op.pop();
                    val.push(calculate(v1, v2, operation));
                }
                op.push(c);
            }
        }
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operation = op.pop();
            val.push(calculate(v1, v2, operation));
        }
        System.out.println(val.peek());
        // Close the scanner to free resources
        sc.close();
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    private static int calculate(int v1, int v2, char op) {
        if (op == '+') return v1 + v2;
        if (op == '-') return v1 - v2;
        if (op == '*') return v1 * v2;
        if (op == '/') return v1 / v2;
        return 0;
    }
}
