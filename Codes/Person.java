// Base class
public class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
public class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the constructor of the superclass
        this.subject = subject;
    }

    // Override or extend functionality
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the method from the superclass
        System.out.println("Subject: " + subject);
    }

    // Main method to test
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");
        t.displayInfo();
    }
}
