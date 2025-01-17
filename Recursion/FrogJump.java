import java.util.*;
public class FrogJump {
    
    static int best(int[]arr, int n, int index){

        if (index == n-1) {
            return 0;
        } 

        int op1 = Math.abs(arr[index]+ arr[index+1]) + best(arr, n, index+1);
        int op2 = Math.abs(arr[index]+ arr[index+2]) + best(arr, n, index+2);
        if (index == n-2) {
            return op1;
        }
        return Math.min(op1, op2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Close the scanner to free resources
        sc.close();
    }
}