# chakar-bank
### A Command-Line Java Bank Account System

---

## ⚙️ What It Does

A simple CLI banking system that simulates real financial behavior:
- ✅ Register with name & surname → auto-generates unique account number
- ✅ Deposit & withdraw money with input validation (`hasNextDouble()`)
- ✅ Prevent overdrafts and negative transactions
- ✅ Encapsulated balance field (private)
- ✅ Clean console interface with menu navigation

No GUI. No database. Yet.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java SE (Core Java) |
| Input Handling | `Scanner`, `hasNextDouble()` |
| OOP | Encapsulation, Constructors, Methods |
| Storage | In-memory only (planned: file + database) |
| Tools | IntelliJ IDEA |

---

## 📂 Project Structure
- BankAccount.java    `// Core logic: deposit, withdraw, balance, account gen`
-  Main.java          `// User interface: menu, registration, login flow`


---

## ▶️ How to Run

1. Open in **IntelliJ IDEA** or any Java IDE
2. Run `Main.java`
3. Follow prompts:
    - Enter your name and surname
    - Choose: **Register** → then **Login**
    - Once logged in: Deposit, Withdraw, Check Balance

> 💡 Your account number is generated randomly on registration.  
> Save it. You’ll need it to log back in.

---

## 🔮 Future Plans 

| Phase     | Goal                          | 
|-----------|-------------------------------|
| ✅ Done    | Basic CLI Banking             |
| 🟡 Next   | Password Authentication       | 
| 🟡 Next   | Transaction History to `.txt` | 
| 🔴 Soon   | SQLite Database               | 
| 🔴 Soon   | Swing GUI                     | 
| 🔴 Future | Spring Boot REST API          | 
 

---

© 2025 Chakar Medzhidova