package throwdemo;

public class ThrowDemo {

    public static void main(String[] args) {

        AccountManager manager = new AccountManager();

        System.out.println("Account = " + manager.getBalance());

        manager.deposit(100);

        System.out.println("Account = " + manager.getBalance());

        try {
            manager.withdraw(90);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Account = " + manager.getBalance());

        try {
            manager.withdraw(29);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Account = " + manager.getBalance());
    }

}
