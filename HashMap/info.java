import java.util.*;

public class info {
    static void HasMapMethod() {
        // Syntax
        HashMap<String, Integer> mp = new HashMap<>();
        // adding information
        mp.put("Akash", 20);
        mp.put("Ayushi", 21);
        mp.put("Harshit", 19);
        mp.put("Nitin", 21);
        // getting value from a key
        System.out.println(mp.get("Nitin"));
        // Changing value of a key
        mp.put("Akash", 35);
        /*
         * It has unique value means that it will not create a new akash
         * it will simply just update the akash value
         */

        // To remove the pair of key and value pair
        mp.remove("Harshit");
        mp.remove("Riya"); // It will return null

        // Check if the key contain or not
        System.out.println(mp.containsKey("Nitin"));

        // Adding a new entry if it doesn't exist
        mp.putIfAbsent("Yash" , 53);
        mp.putIfAbsent("Ayllsa" , 53);

        // Get all keys in the Hashmap
        System.out.println(mp.keySet());

        // Get all values in the Hashmap
        System.out.println(mp.values());

        // Get all the entries in the Hashmap
        System.out.println(mp.entrySet());


        // TRAVERSING ALL ENTERIES OF HASHMAP - Multiple Methods
        for (String key : mp.keySet()) {
            System.out.println("Age of " + key + " is " + mp.get(key));
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HasMapMethod();
        // Close the scanner to free resources
        sc.close();
    }
}
