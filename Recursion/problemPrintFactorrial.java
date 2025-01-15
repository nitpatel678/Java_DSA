import java.util.Scanner;

class recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1);
        }
    }
}

public class problemPrintFactorrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int a = sc.nextInt();
        int result = recursion.factorial(a);
        System.out.println("Factorial: " + result);
        // Close the scanner to free resources
        sc.close();
    }
}