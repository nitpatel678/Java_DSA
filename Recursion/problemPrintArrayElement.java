import java.util.Scanner;
class recursion {
    static void print_array(int[] array, int size) {
        if (size == 0) { // Base case
            System.out.print(array[size] + "\t"); // Print the first element
            return; // Exit recursion
        } else {
            print_array(array, size - 1); // Recursive call
            System.out.print(array[size] + "\t"); // Print the current element
        }
    }
    
}
public class problemPrintArrayElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int a = sc.nextInt();
        int [] array = new int [a];
        System.out.println("Enter the array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Printing the array elements:");
        recursion.print_array(array, a);
        sc.close();
    }
}