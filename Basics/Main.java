import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double area = r * r * Math.PI; // Changed 3.14 to Math.PI for precision
        System.out.println(area);

        // Close the scanner to free resources
        sc.close();
    }
}


