public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Marco", 1500.00);
        BankAccount account2 = new BankAccount("Harun", 500.00);
        BankAccount account3 = new BankAccount("Brian", 2500.00);

        account1.deposit(200.00);
        account2.withdraw(100.00);
        account3.deposit(500.00);
        account1.withdraw(2000.00);

        System.out.println("\n--- Interest Calculation ---");
        System.out.println("Interest for " + account1.accountHolderName + ": " + String.format("%.2f", account1.calculateInterest()));
        System.out.println("Interest for " + account2.accountHolderName + ": " + String.format("%.2f", account2.calculateInterest()));
        System.out.println("Interest for " + account3.accountHolderName + ": " + String.format("%.2f", account3.calculateInterest()));

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        System.out.println("\nBank Name from static variable: " + BankAccount.bankName);
        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}
