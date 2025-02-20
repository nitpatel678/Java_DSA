import java.util.*;

public class info {
    static void HasMapMethod() {
        // Syntax
        Map<String, Integer> mp = new HashMap<>();
        // adding information
        mp.put("Akash", 20);
        mp.put("Ayushi", 21);
        mp.put("Harshit", 19);
        mp.put("Nitin", 21);
        // getting value from a key
        System.out.println(mp.get("Nitin"));
        // Changing value of a key
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HasMapMethod();
        // Close the scanner to free resources
        sc.close();
    }
}
