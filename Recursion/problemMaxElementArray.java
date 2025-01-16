import java.util.Scanner;

class recursion{
    static int largest_element(int [] array , int size){
        if (size == 1) {
            return array[0];
        }

        // Recursive case: get the largest element in the smaller array
        int max_in_rest = largest_element(array, size - 1);

        // Compare the last element with the max of the rest
        return Math.max(array[size - 1], max_in_rest);
    }
}

public class problemMaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(recursion.largest_element(arr, n));
        sc.close();
    }
}