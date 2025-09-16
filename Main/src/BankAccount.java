import java.util.Scanner;
public class BankAccount {
    private double balance;
    private final String name;
    private final String surname;
    private final String password;
    private final String phone_num;


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
    public void deposit(Scanner scanner) {
        double amount = BankAccount.getValidAmount(scanner);
        if (amount < 0 ) {
            System.out.println("Operation failed. Input must be a positive value");
            return;
        }
        balance += amount;
        System.out.println("Operation successful. New balance: $" + String.format("%.2f",balance));


    }
    public String getPhone_num() {
        return phone_num;
    }

    //withdrawal
    public void withdraw(Scanner scanner) {
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

    public boolean SubtractBalance(double amount) {
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

}
