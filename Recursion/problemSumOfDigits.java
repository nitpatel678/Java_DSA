import java.util.Scanner;

class recursion{
    static int sum(int n){
        if (n == 1) {
            return 1;
        }
        else if (n == 0) {
            return 0;
        }
        else{
            int s = n%10 + sum(n/10);

            return s;
        }
    }
}
public class problemSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int a = sc.nextInt();
        int ans = recursion.sum(a);
        System.out.println("Answer : " + ans);
        // Close the scanner to free resources
        sc.close();
    }
}