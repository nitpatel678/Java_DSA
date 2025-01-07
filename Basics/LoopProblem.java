import java.util.Scanner;
public class LoopProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for the factorial:");
        int n = sc.nextInt();

        // SUM OF THE NUMBER 

        // int rev = 0;
        // int sum = 0;
        // while (n>0) {
        //     rev = n%10;
        //     sum = sum + rev;
        //     n = n/10;
        // }

        // System.out.println("Sum of the given number is : " + sum);


        // FINDING THE FACTORIAL OF THE NUMBER :

        // int fact = 1;
        // while (n>0) {
        //     fact = fact * n;
        //     n--;
        // }

        // System.out.println("The factorial of the given number is : " + fact);


        // PRINTING THE PATTERN

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    // Print star for border rows or columns
                    System.out.print("*");
                } else {
                    // Print space for the hollow section
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }


        // Close the scanner to free resources
        sc.close();
    }
}