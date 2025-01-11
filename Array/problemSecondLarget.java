import java.util.Scanner;
public class problemSecondLarget {
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

        int largest = arr[0];
        int secondlargest = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>secondlargest && arr[i]<largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second largest: " + secondlargest);

        sc.close();
    }
}