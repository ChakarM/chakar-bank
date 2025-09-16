import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount currentAccount = null;

        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Register new account");
            System.out.println("2. Login with phone number");
            System.out.println("3. Exit");
            System.out.print("> ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    registerAccount(bank);
                    break;
                case 2:
                    currentAccount = loginAccount(bank);
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }

            if (currentAccount != null) {
                bankMenu(bank, currentAccount);
                currentAccount = null;
            }
        }
    }

    private static void registerAccount(Bank bank) {
        System.out.print("Enter your first name: ");
        String name = scanner.next();

        System.out.print("Enter your last name: ");
        String surname = scanner.next();

        System.out.print("Enter your phone number: ");
        String phone = scanner.next();

        System.out.print("Create a password: ");
        String password = scanner.next();

        bank.register(name, surname, phone, password);
        System.out.println("Registration successful! You can now login.");
    }

    private static BankAccount loginAccount(Bank bank) {
        System.out.print("Enter your phone number: ");
        String phone = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        if (bank.login(phone, password)) {
            System.out.println("Login successful!");
            return bank.getAccount(phone);
        } else {
            System.out.println("Login failed. Please try again.");
            return null;
        }
    }

    private static void bankMenu(Bank bank, BankAccount account) {
        while (true) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Make Transaction");
            System.out.println("4. Check Balance");
            System.out.println("5. Logout");
            System.out.print("> ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    account.deposit(scanner);
                    break;
                case 2:
                    account.withdraw(scanner);
                    break;
                case 3:
                    makeTransaction(bank, account);
                    break;
                case 4:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void makeTransaction(Bank bank, BankAccount senderAccount) {
        String senderPhone = senderAccount.getPhone_num();
        System.out.print("Enter recipient's phone number: ");
        String receiverPhone = scanner.next();
        bank.transact(senderPhone, receiverPhone);

    }

    private static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}