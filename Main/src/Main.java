import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount acccount = null;
        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Register new account");
            System.out.println("2. Login with account number");
            System.out.println("3. Exit");
            System.out.print("> ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    RegisterAccount(scanner);
                    break;
                case 2:
                    acccount = loginAccount(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid option");
            }
            if (acccount != null) {
                BankMenu(scanner, acccount);
            }
        }

    }

    public static void RegisterAccount(Scanner scanner) {
        System.out.print("Enter your first name: ");
        String name = scanner.next();
        System.out.print("Enter your last name: ");
        String surname = scanner.next();

        BankAccount newBankAccount = new BankAccount(name, surname);
        System.out.println("Registration successful!");
        System.out.println("Here is number of your bank account: " + newBankAccount.getAccountNumber());
        System.out.println("Please make sure to remember it or write it down. You will use it to log in.");
    }

    public static BankAccount loginAccount(Scanner scanner) {
        System.out.print("Enter your account number: ");
        String inputAccNum = scanner.next();

        // For now — fake login. In the future, load from file/database
        // For now, assume account exists only if it was created in register()
        System.out.println("⚠️ Login feature not implemented yet. Just returning dummy account.");
        return new BankAccount("John", "Doe"); // Temporary placeholder
    }

    public static void BankMenu( Scanner scanner, BankAccount account) {
        while (true) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Info");
            System.out.println("5. Logout");
            System.out.print("> ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    if (scanner.hasNextDouble()) {
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    }
                    else {
                        System.out.println("❌ Invalid input. Please enter a number.");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: $");
                    if (scanner.hasNextDouble()) {
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    }
                    else {
                        System.out.println("❌ Invalid input. Please enter a number.");
                        scanner.next();
                    }
                    break;
                case 3:
                    account.getBalance();
                    break;
                case 4:
                    account.getUserInfo();
                    break;
                case 5:
                    System.out.println("Logged out.");
                    account = null;
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}