import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        scanner.close();
    }
}