import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no you want to print:");
        int a = sc.nextInt();
        int b = 1;
        while (b<=a) {
            System.out.println(b);
            b++;
        }

        int [] arr = new int[a];
        for (int i=0; i<a; i++) {
            System.out.print("Enter the element :");
            int k = sc.nextInt();
            arr[i] = k;
        }

        System.out.println("Printing the array: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i]);
            System.out.println("\t");
        }

        sc.close();
    }
}