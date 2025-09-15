# chakar-bank
### A Command-Line Java Banking System with Authentication & Transactions

---

## ⚙️ What It Does

A complete CLI banking system implementing real financial operations:
- ✅ **User Registration** with phone number and secure password hashing
- ✅ **Phone-based Authentication** system with credential validation
- ✅ **Fund Transfers** between accounts with atomic transaction processing
- ✅ **Deposit & Withdrawal** with comprehensive input validation
- ✅ **Balance Management** with overdraft protection
- ✅ **Secure Storage** using HashMap collections with password hashing

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java SE (Core Java) |
| Data Structures | `HashMap`, `ArrayList` |
| Security | Password hashing with salt transformation |
| Input Validation | Custom static validation utilities |
| OOP | Encapsulation, Static methods, Multi-class architecture |
| Error Handling | Try-catch, Input mismatch protection |

---

## 📂 Project Structure
- `Bank.java` - Central manager handling authentication and transactions
- `BankAccount.java` - Core account operations and balance management
- `Main.java` - User interface and menu navigation

---

## ▶️ How to Run

1. Open in **IntelliJ IDEA** or any Java IDE
2. Run `Main.java`
3. Follow prompts:
   - Register with name, surname, phone number, and password
   - Login using phone number and password
   - Perform transactions: Deposit, Withdraw, Transfer funds
   - View account information and balance

> 🔐 Passwords are securely hashed and never stored in plain text

---

## 🚀 Key Features Implemented

- **Phone-based Authentication** - No more account numbers to remember
- **Secure Password Storage** - Hashed passwords with salt transformation
- **Inter-Account Transfers** - Send money between users by phone number
- **Robust Input Validation** - Handles all invalid input scenarios
- **Atomic Transactions** - Transfers either complete fully or not at all
- **Error Recovery** - Proper error messages and system stability

---

## 🔮 Future Enhancements

| Status | Feature | Description |
|--------|---------|-------------|
| ✅ Done | Basic CLI Banking | Core account operations |
| ✅ Done | Password Authentication | Secure login system |
| ✅ Done | Fund Transfers | Phone-to-phone transactions |
| 🟡 Next | Transaction History | Persistent transaction logging |
| 🟡 Next | File Persistence | Save/load accounts to JSON |
| 🔴 Soon | SQLite Database | Permanent data storage |
| 🔴 Future | REST API | Spring Boot integration |

---

## 🎯 Technical Achievements

- Implemented professional authentication patterns
- Designed multi-class architecture with separation of concerns
- Solved Scanner resource management issues
- Created atomic transaction processing
- Built comprehensive input validation system

---

© 2025 Chakar Medzhidova