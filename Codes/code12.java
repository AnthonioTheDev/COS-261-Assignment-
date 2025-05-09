public class code12 {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        code12 calc = new code12();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10)); // Uses int add(int, int)
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15)); // Uses int add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.2)); // Uses double add(double, double)
    }
}
