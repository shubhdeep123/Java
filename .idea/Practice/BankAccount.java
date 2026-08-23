package Practice;
public class BankAccount {
    public static void main (String[] args) {
        HDFCAccount chiragAccount = new HDFCAccount();
        chiragAccount.deposit(1000);
        System.out.println("Chirag's Account Balance: " + chiragAccount.getBalance());
        chiragAccount.withdraw(500);
        System.out.println("Chirag's Account Balance after withdrawal: " + chiragAccount.getBalance());
    }
}

class HDFCAccount {
    private int balance;
    private final int accountNumber;

    public HDFCAccount() {
        this.accountNumber = (int) (Math.random() * 1000000);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
