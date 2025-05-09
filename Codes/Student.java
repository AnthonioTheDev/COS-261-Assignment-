public class Student {
    // Properties
    private String name;
    private String matricNo;
    private double score;

    // Constructor
    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Matric Number: " + matricNo);
        System.out.println("Score: " + score);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", "MAT2023001", 87.5);
        student1.displayInfo();
    }
}
