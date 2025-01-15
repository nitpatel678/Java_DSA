import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
// import java.util.Collections;
// This class allow to reverse the arraylis
class arrayPart {
    static void print_2darray(int[][] arr) {
        System.out.println("Printing the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print_array(int[] arr) {
        System.out.println("Printing the 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // Add a line break at the end
    }

    static int[][] create2d_array(int x, int y) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[x][y];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static int[] create_array(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void reverseArrayLis(ArrayList<Integer> l) {
        int i = 0, j = l.size() - 1;
        while (i < j) {
            Integer temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
}

public class problemReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 elements for the list:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // Correctly refer to the reverseArrayLis method from the arrayPart class
        arrayPart.reverseArrayLis(list);
        // Collections.sort(list);
        // Collections.reverse(list);

        System.out.println("Reversed list: " + list);

        // Close the scanner to free resources
        sc.close();
    }
}
