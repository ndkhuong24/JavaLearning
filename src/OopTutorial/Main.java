package OopTutorial;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
    }
}
