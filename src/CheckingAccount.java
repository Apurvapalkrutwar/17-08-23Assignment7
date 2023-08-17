public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            return String.format("Withdrew $%.2f. New balance: $%.2f", amount, balance);
        } else if (amount > 0 && (balance - amount) < -overdraftLimit) {
            return "Withdrawal exceeds overdraft limit.";
        } else {
            return "Invalid withdrawal amount.";
        }
    }

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("54321", "Alice Johnson", 800.0, 200.0);
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(checkingAccount.deposit(300.0));
        System.out.println(checkingAccount.withdraw(1000.0));
        System.out.println(checkingAccount.getAccountInfo());
    }
}

