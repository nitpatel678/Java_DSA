import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // wrapper class
        Integer i = Integer.valueOf(5);
        System.out.println(i);
        Float f = Float.valueOf(5.6f);
        System.out.println(f);

        // Creating the arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Float> l2 = new ArrayList<>();
        // ArrayList<Boolean> l3 = new ArrayList<>();

        // Entering element in array list
        System.out.println("Enter the element");
        for (int j = 0; j < 5; j++) {
            l1.add(sc.nextInt());
        }

        // get each element
        // for (int j = 0; j < 5; j++) {
        //     System.out.print(l1.get(j)+"\t");
        // }

        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j)+"\t");
        }
        
        // without loop print like [5,6,7,8]
        System.out.println(l1);

        // to add at a particular index
        l1.add(2,400);
        System.out.println(l1);
        // to modify the value at a particular index
        l1.set(1, 69);

        // to remove the value at a particular index
        l1.remove(1);
        System.out.println(l1);
        // if there is no wrapper class then we can store anything in the arraylist
        ArrayList l = new ArrayList();
        l.add("Nitin");
        l.add(5.6);
        l.add(true);
        System.out.println(l);

        
        // Close the scanner to free resources
        sc.close();
    }
}