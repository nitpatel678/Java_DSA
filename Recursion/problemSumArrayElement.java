import java.util.Scanner;

class recursion{
    static int sum_array(int[]arr, int size ){
        if (size == 0) {
            return 0;
        }
        else{
            return arr[size -1] + sum_array(arr, size-1);
        }
    }
}

public class problemSumArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of the element:");
        System.out.println(recursion.sum_array(arr, n));
        // Close the scanner to free resources
        sc.close();
    }
}