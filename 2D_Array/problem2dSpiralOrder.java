import java.util.Scanner;

class arrayPart {
    static void print_2darray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // Corrected the inner loop condition
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print_array(int arr[]){
        System.out.println("Printing the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }

    static int[][] create2d_array(int x , int y) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[x][y];
        System.out.println("Enter the array element:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt(); // Properly assigning values to the array
            }
        }
        return arr;
    }

    static int[] create_array(int size){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}

public class problem2dSpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size :");
        int a = sc.nextInt();
        int [][] arr = arrayPart.create2d_array(a, a);
        System.out.println("Printing before spiral:");
        arrayPart.print_2darray(arr);

        
        // Close the scanner to free resources
        sc.close();
    }
}
