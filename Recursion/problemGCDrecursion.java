import java.util.Scanner;

class gcd{
    static int gcd_no(int x, int y){
        if (y == 0) {
            return x;
        }
        else{
            return gcd_no(y , x%y);
        }
    }
}

public class problemGCDrecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = sc.nextInt();
        System.out.println("Enter the second no:");
        int b = sc.nextInt();
        System.out.println(gcd.gcd_no(a, b));
        // Close the scanner to free resources
        sc.close();
    }
}