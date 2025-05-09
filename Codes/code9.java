
import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        // Print multiplication table from 1 to 10
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close(); // Close the scanner
    }
}
