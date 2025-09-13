public class BankAccount {
    private double balance;
    private String name;
    private String surname;
    private String AccountNumber;

    public BankAccount(String name, String surname) {
        this.balance = 0;
        this.name = name;
        this.surname = surname;
        this.AccountNumber = "BA" + (int) (Math.random()*1000000);
    }

    public void deposit(double amount) {
        if (amount < 0 ) {
            System.out.println("Operation failed. Input must be a positive value");
            return;
        }
        balance += amount;
        System.out.println("Operation successful. New balance: $" + String.format("%.2f",balance));

    }

    public void withdraw(double amount) {
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

    public void getBalance() {
        System.out.println("Balance: $" + balance);
    }
    public String getAccountNumber() {
        return AccountNumber;
    }


    public void getUserInfo() {
        System.out.print("Account number: " + AccountNumber + "\n" + "Owner: " + name + " " + surname);
    }
}
