import java.util.*;
public class Basics {
    // Creating a data type
    public static class Student{
        String name;
        int age;
        double percent;
    }

    public static class Car{
        String name;
        String type;
        int price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student x = new Student();
        x.age = 45;
        x.name = "Nitin";

        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 400000;
        c1.type = "Hatchback";

        System.out.println(x.name);
        // Close the scanner to free resources
        sc.close();
    }
}