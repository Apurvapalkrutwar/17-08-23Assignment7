public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new SavingsAccount("11111", "Saver One", 1000.0, 2.5);
        accounts[1] = new CheckingAccount("22222", "Spender Two", 1500.0, 200.0);
        accounts[2] = new SavingsAccount("33333", "Saver Three", 2000.0, 3.0);
        accounts[3] = new CheckingAccount("44444", "User Four", 800.0, 100.0);
        accounts[4] = new SavingsAccount("55555", "Saver Five", 2500.0, 2.0);

        System.out.println("Initial Account Information:");
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nProcessing Accounts:");
        AccountProcessor.processAccounts(accounts);
    }
}
