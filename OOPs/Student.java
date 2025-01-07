// Parent class: People
public class people {
    // Common attributes for all people
    private String name;
    private int age;

    // Constructor
    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class: Student
public class student extends people {
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Call parent constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter methods
    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent class's displayInfo method
        System.out.println("Roll Number: " + rollNumber + ", Marks: " + marks);
    }
}

// Main class: Person
public class person {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Alice", 20, 101, 88.5);

        // Display student information
        student.displayInfo();
    }
}
