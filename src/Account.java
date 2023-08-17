public class Account {
    private String accountNumber;
    private String accountHolder;
    public double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return String.format("Deposited $%.2f. New balance: $%.2f", amount, balance);
        } else {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return String.format("Withdrew $%.2f. New balance: $%.2f", amount, balance);
        } else {
            return "Insufficient funds or invalid withdrawal amount.";
        }
    }

    public String getAccountInfo() {
        return String.format(
                "Account Number: %s\nAccount Holder: %s\nBalance: $%.2f",
                accountNumber, accountHolder, balance
        );
    }

    public static void main(String[] args) {
        Account account = new Account("12345", "John Doe", 1000.0);
        System.out.println(account.getAccountInfo());
        System.out.println(account.deposit(500.0));
        System.out.println(account.withdraw(200.0));
        System.out.println(account.getAccountInfo());
    }
}
