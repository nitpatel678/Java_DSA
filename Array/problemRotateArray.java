import java.util.Scanner;

public class problemRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();

        k = k % a;
        if (k < 0) {
            k += a; // Handle negative rotations
        }

        int[] rotated = new int[a];
        int index = 0;

        for (int i = a - k; i < a; i++) {
            rotated[index++] = arr[i];
        }

        // Copy the rest of the elements
        for (int i = 0; i < a - k; i++) {
            rotated[index++] = arr[i];
        }

        System.out.println("After rotating the array:");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + "\t");
        }

        sc.close();
    }
}
