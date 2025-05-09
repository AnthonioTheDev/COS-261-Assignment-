package code17;

public class calc {

    // DRY: Create a method to calculate sum
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 3;

        // Reuse the method to calculate the sum
        System.out.println("Sum1: " + add(num1, num2));

        num1 = 7;
        num2 = 8;

        // Reuse the method to calculate the sum
        System.out.println("Sum2: " + add(num1, num2));

        num1 = 9;
        num2 = 4;

        // Reuse the method to calculate the sum
        System.out.println("Sum3: " + add(num1, num2));
    }
}
