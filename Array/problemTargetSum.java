import java.util.Scanner;
public class problemTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();

        int count = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    count = count + 1;
                }
            }
        }

        System.out.println("Total no. of pairs is : " + count);

        // Close the scanner to free resources
        sc.close();
    }
}