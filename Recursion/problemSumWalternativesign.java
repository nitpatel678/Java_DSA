import java.util.Scanner;

class recursion {
    static int print_sum(int n) {
        // Base case
        if (n == 0) {
            return 0; // Return 0 when n is 0
        } else if (n == 1) {
            return 1; // Base case for n == 1
        } else {
            // Recursive case: Add or subtract based on even/odd condition
            if (n % 2 == 0) {
                return n + print_sum(n - 1); // Add if n is even
            } else {
                return -n + print_sum(n - 1); // Subtract if n is odd
            }
        }
    }    
}

public class problemSumWalternativesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        int result = recursion.print_sum(n);
        System.out.println("Result: " + result);
        // Close the scanner to free resources
        sc.close();
    }
}