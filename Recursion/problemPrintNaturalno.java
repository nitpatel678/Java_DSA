import java.util.Scanner;

class recursion{
    static void print_no(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        else if (n>1) {
            print_no(n-1);
            System.out.println(n);
        }
        else {
            System.out.println("No is smaller");
        }

    }
}

public class problemPrintNaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        recursion.print_no(a);
        // Close the scanner to free resources
        sc.close();
    }
}
