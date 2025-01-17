import java.util.*;
public class problemReverseString {
    static String reverse_string(String s , int index){
        if (index < 0) {
            return "";
        } 
        char c  = s.charAt(index);
        String a = reverse_string(s, index-1);
        return c + a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String string = sc.nextLine();
        int n = string.length();
        System.out.println("Printing the reverse string");
        System.out.println(reverse_string(string, n-1));
    }
}
