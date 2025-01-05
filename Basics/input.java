import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = sc.nextInt();

        
        sc.nextLine();

        System.out.println("Please enter two different strings:");
        String b = sc.next(); // Reads a single word
        sc.nextLine(); // Consume any remaining characters, if necessary
        String c = sc.nextLine(); // Reads the whole line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
