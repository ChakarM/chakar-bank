import java.util.HashMap;
import java.util.Scanner;

public class Bank {
     private HashMap<String, String> LoginData;
     private HashMap<String, BankAccount> CreatedAccounts;
     private Scanner scanner = new Scanner(System.in);

     public void register(String name, String surname, String phoneNum, String password) {
          password = getHashedPassword(password);
          BankAccount account = new BankAccount(name, surname, phoneNum, password);
          LoginData.put(phoneNum, password);
          CreatedAccounts.put(phoneNum, account);
     }
     public boolean login(String phoneNum, String password) {
          if (!CreatedAccounts.containsKey(phoneNum)) {
               System.out.println("Wrong login");
               return false;
          }
          String storedHash = LoginData.get(phoneNum);
          String pwd = getHashedPassword(password);
          if (!storedHash.equals(pwd)) {
               System.out.println("Wrong password");
               return false;
          }
          return true;
     }
     //password
     private String getHashedPassword(String password) {
          return Integer.toString(password.hashCode() * 31 + 12345);
     }

     public boolean transact(String senderPhone, String receiverPhone) {
          if (!CreatedAccounts.containsKey(senderPhone) || !CreatedAccounts.containsKey(receiverPhone)) {
               System.out.println("One or both accounts not found");
               return false;
          }
          BankAccount sender = CreatedAccounts.get(senderPhone);
          BankAccount receiver = CreatedAccounts.get(receiverPhone);

          double amount = BankAccount.getValidAmount(this.scanner);

          if (sender.SubstrateBalance(amount)) {
               if (receiver.addBalance(amount)) {
                    System.out.println("Transfer successful!");
                    return true;
               } else {
                    sender.addBalance(amount); // Rollback
                    System.out.println("Transfer failed: invalid amount for receiver");
               }
          } else {
               System.out.println("Transfer failed: insufficient funds or invalid amount");
          }
          return false;
     }


}
