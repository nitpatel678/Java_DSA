import java.util.Scanner;
public class problemSwapWTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();
        System.out.println("Before Swapping:" + a + " " + b);
        a = a + b;
        b = a - b;
        a = -(b - a);
        
        System.out.println("After Swapping:" + a + " " + b);
        // Close the scanner to free resources
        sc.close();
    }
}