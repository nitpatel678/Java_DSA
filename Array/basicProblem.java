import java.util.Scanner;

// Q. find the smallest and the largest element in the array
// and return in the array form and print it

class arrayFucntion {
    public static int[] create_array(int size, Scanner sc) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] get_array(int[] array, int size) {
        // Initialize both variables with the first element of the array
        int small = array[0];
        int largest = array[0];

        // Traverse the rest of the array
        for (int i = 1; i < size; i++) {
            if (array[i] < small) {
                small = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return new int[]{small, largest}; // Returning the result in the form of an array
    }
}

class printarray {
    public static void print_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println(); // For cleaner output
    }
}

public class basicProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = arrayFucntion.create_array(size, sc);
        
        // Getting the result of smallest and largest values
        int[] result = arrayFucntion.get_array(array, size);

        // Printing the result
        printarray.print_array(result);

        // Close the scanner to free resources
        sc.close();
    }
}
