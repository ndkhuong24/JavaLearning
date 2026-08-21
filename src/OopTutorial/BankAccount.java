package OopTutorial;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

//    public void deposit(double money) {
//        if (money > 0) {
//            balance += money;
//        }
//    }
//
//    public double withdraw(double money) {
//        if (money > 0 && money <= balance) {
//            balance -= money;
//        }
//        return balance;
//    }

    public double getBalance() {
        return balance;
    }
}
