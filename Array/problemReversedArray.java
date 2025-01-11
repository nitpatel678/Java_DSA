import java.util.Scanner;
public class problemReversedArray {
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

        System.out.println("Before reversing the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        int c = 0;

        int [] revarr = new int[a];        
        for (int i = arr.length-1 ; i >= 0; i--) {
            int key = arr[i];
            revarr[c] = key;
            c = c + 1;
        }

        System.out.println("\nAfter reversing the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(revarr[i]+"\t");
        }

        sc.close();
    }
}