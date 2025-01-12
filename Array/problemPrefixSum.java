import java.util.Scanner;

class arrayFunction {
    static void print_array(int arr[]) {
        System.out.println("Printing array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // To add a new line after printing the array
    }

    static int[] prefixSum(int arr[], int index) {
        int n = arr.length;
        int newarr[] = new int[n];
        newarr[0] = arr[0];
    
        for (int i = 1; i <= index; i++) {
            newarr[i] = arr[i] + newarr[i - 1];
        }
    
        for (int i = index + 1; i < n; i++) {
            newarr[i] = arr[i];
        }
    
        return newarr;
    }
    
}

public class problemPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int index = 0; index < arr.length; index++) {
            int k = sc.nextInt();
            arr[index] = k;
        }

        System.out.println("Enter the index fo the presum < " + n);
        int p = sc.nextInt();

        System.out.println("Before presum the array:");

        arrayFunction.print_array(arr);
        System.out.println("After prefix the sum:");       
        arrayFunction.print_array( arrayFunction.prefixSum(arr, p));
        // Close the scanner to free resources
        sc.close();
    }
}
