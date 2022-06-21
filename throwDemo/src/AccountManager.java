public class AccountManager {
    private double balance;
    public void deposit(double amount) {
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficientException {
        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            // System.out.println("Withdraw failed: Insufficient balance!");
            throw new BalanceInsufficientException("Withdraw failed: Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }

}
