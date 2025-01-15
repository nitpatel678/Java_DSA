import java.util.Scanner;
class recursion{
    static void print_number(int a){
       if (a == 1){
        System.out.println(a);
        return;
       }
       else{
        // call the method again
        print_number(a-1);
        System.out.println(a);
       }

    }
}
public class problemPrintNnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int a = sc.nextInt();
        recursion.print_number(a);

        // Close the scanner to free resources
        sc.close();
    }
}