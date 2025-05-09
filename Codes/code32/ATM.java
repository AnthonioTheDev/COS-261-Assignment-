
import java.util.Scanner;

public class ATM {
    // Initial account balance
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM!");

        // Menu loop
        do {
            // Display options
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            // Handle user selection
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4); // Repeat until user exits

        scanner.close();
    }

    // Display current balance
    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Handle deposit transaction
    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount; // Update balance
            System.out.printf("Deposit successful! New balance: $%.2f%n", balance);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than zero.");
        }
    }

    // Handle withdrawal transaction
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Deduct from balance
            System.out.printf("Withdrawal successful! New balance: $%.2f%n", balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than zero.");
        }
    }
}
