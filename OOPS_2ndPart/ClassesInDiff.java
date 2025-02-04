import java.util.*;

// Classes are passed by reference it means that when there is a change in value 
// it happens to the original value
public class  ClassesInDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basics.Student s = new Basics.Student();
        s.name = "Student";
        System.out.println(s.name);
        sc.close();
    }
}

// Getters and Setters