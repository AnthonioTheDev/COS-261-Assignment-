import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.println("Welcome to the Even/Odd Checker program");

        boolean keepRunning = true; // Control variable to keep the loop running

        // Start of the loop to check numbers repeatedly
        while (keepRunning) {
            // Prompt user to enter a number
            System.out.print("Enter a number: ");
            int number = myInput.nextInt(); // Read an integer from user input

            // Check if the number is even or odd using modulus operator
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }

            // Ask user if they want to check another number
            System.out.print("Would you like to check another number? (yes/no): ");
            String response = myInput.next().toLowerCase(); // Read response and convert to lowercase

            // Exit the loop if the user answers "no"
            if (response.equals("no")) {
                keepRunning = false;
            }
        }

        // Close the Scanner to prevent resource leak
        myInput.close();

        // Final message to the user after exiting the loop
        System.out.println("Thank you for using the Even/Odd Checker program!");
    }
}
