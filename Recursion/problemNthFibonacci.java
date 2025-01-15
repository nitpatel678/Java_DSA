import java.util.Scanner;

class recursion{
    static int result_fibo(int a) {
        if (a == 0) {
            return 0; // Base case: F(0) = 0
        } else if (a == 1) {
            return 1; // Base case: F(1) = 1
        } else {
            return result_fibo(a - 1) + result_fibo(a - 2);
        }
    }
    
}

public class problemNthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int a = sc.nextInt();
        int result = recursion.result_fibo(a);
        System.out.println(result);
        sc.close();
    }
}