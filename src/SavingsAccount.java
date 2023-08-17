public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountInfo() {
        return String.format(
                "%s\nInterest Rate: %.2f%%",
                super.getAccountInfo(), interestRate
        );
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("67890", "Jane Smith", 1500.0, 3.5);
        System.out.println(savingsAccount.getAccountInfo());
        System.out.println(savingsAccount.deposit(200.0));
        System.out.println(savingsAccount.withdraw(100.0));
        System.out.println(savingsAccount.getAccountInfo());
    }
}
