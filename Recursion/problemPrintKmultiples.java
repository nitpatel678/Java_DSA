import java.util.Scanner;

class recursion{
    static void print_multiples(int a, int b) {
        if (b <= 0) {
            System.out.println("Error code: 404");
             
        } else if (b == 1) {
            System.out.println(a);
        } else {
            print_multiples(a, b-1);
            System.out.println(a*b);
        }
    }
    
}

public class problemPrintKmultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        System.out.println("Enter the multiples time : ");
        int y = sc.nextInt();
        recursion.print_multiples(x, y);
        // Close the scanner to free resources
        sc.close();
    }
}