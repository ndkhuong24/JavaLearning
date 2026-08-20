package OOP;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);

        System.out.println(account.getBalance());
    }
}
