import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter T or F : ");
        String a = sc.next();
        
        switch (a) {
            case "T": System.out.println("Input is truth"); 
                      break;
            case "F": System.out.println("Input is false");
                      break;
            default: System.out.println("Invalid input");
        }


        // Close the scanner to free resources
        sc.close();
    }
}