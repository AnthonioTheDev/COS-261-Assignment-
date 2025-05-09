public class code16 { // Class: PascalCase
    private String accountHolder; // Variable: camelCase
    private double balance; // Variable: camelCase

    public void deposit(double amount) { // Method: camelCase
        balance += amount;
    }

    public void printAccountInfo() { // Method: camelCase
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
