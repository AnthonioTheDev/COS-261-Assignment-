package code31;

public class Student {
    private String name;
    private String matricNo;
    private double score;

    public Student(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric No: " + matricNo);
        System.out.println("Score: " + score);
        System.out.println("--------------------------");
    }
}
