public class AccountProcessor {
    public static void processAccounts(Account[] accounts) {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                savingsAccount.deposit(500.0);
            } else if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                checkingAccount.withdraw(100.0);
            }

            System.out.println(account.getAccountInfo());
        }
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("11111", "Saver One", 1000.0, 2.5);
        accounts[1] = new CheckingAccount("22222", "Spender Two", 1500.0, 200.0);
        accounts[2] = new SavingsAccount("33333", "Saver Three", 2000.0, 3.0);

        processAccounts(accounts);
    }
}
