import java.util.Scanner;
public class BankAccount {
    private double balance;
    private final String name;
    private final String surname;
    private final String password;
    private final String phone_num;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public BankAccount(String name, String surname, String Phone_number, String password) {
        this.balance = 0;
        this.name = name;
        this.surname = surname;
        this.phone_num = Phone_number;
        this.password = password;
    }

    //get double input
    public static double getValidAmount(Scanner scanner) {
        while(true) {
            try {
                System.out.print("\nInput amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                return amount;
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number: ");
                scanner.nextLine();
            }
        }
    }

    //deposit
    public void deposit() {
        double amount = BankAccount.getValidAmount(scanner);
        if (amount < 0 ) {
            System.out.println("Operation failed. Input must be a positive value");
            return;
        }
        balance += amount;
        System.out.println("Operation successful. New balance: $" + String.format("%.2f",balance));


    }

    //withdrawal
    public void withdraw() {
        double amount = BankAccount.getValidAmount(scanner);
            if (amount > balance) {
                System.out.println("Operation failed. Please make sure you have enough money on your balance.");
                return;
            } else if (amount < 0) {
                System.out.println("Operation failed. Input must be a positive value");
                return;
            }
            balance -= amount;
            System.out.println("Operation successful. New balance: $" + String.format("%.2f",balance));
    }

    public boolean addBalance(double amount) {
        if (amount < 0) {
            return false;
        }
        balance+=amount;
        return true;
    }

    public boolean SubstrateBalance(double amount) {
        if (amount < 0 || amount > this.balance) {
            return false;
        }
        balance-=amount;
        return true;
    }


    //show balance
    public double getBalance() {
        return balance;
    }

    private void menu() {
        System.out.println("\n=== BANK MENU ===");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. View Info");
        System.out.println("5. Logout");
        System.out.print("> ");
    }



}
