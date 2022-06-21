public class Main {
    public static void main(String[] args){
        AccountManager accountManager = new AccountManager();
        System.out.println("Current balance is : " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Current balance is : " + accountManager.getBalance());
        try {
            accountManager.withdraw(50);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Current balance is : " + accountManager.getBalance());
        try {
            accountManager.withdraw(70);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Current balance is : " + accountManager.getBalance());
    }
}