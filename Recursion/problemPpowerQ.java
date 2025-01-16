import java.util.Scanner;
class recursion{
    static int power(int a, int b){
        if (b==0) {
            return 1;
        }
        else{
            return a * power(a, b-1); 
        }
    }
}
public class problemPpowerQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int y = sc.nextInt();
        
        int result = recursion.power(x, y);
        System.out.println("Desired result is: "+result);

        // Close the scanner to free resources
        sc.close();
    }
}