public class BankAccount {

    public static String bankName = "Liceo Bank";
    public static int totalAccounts = 0;
    public static double interestRate = 0.03;

    private static int nextAccountNumber = 1000;
    public static String generateAccountNumber() {
        totalAccounts++;
        return "ACC-" + (nextAccountNumber++);
    }

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance for withdrawal from account " + accountNumber);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + String.format("%.2f", balance));
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
