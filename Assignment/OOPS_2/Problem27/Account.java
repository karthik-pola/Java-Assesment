package OOPS_2.Problem27;

public class Account implements AccountOperation {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // System.out.println("Deposited: " + amount);
        } else {
            // System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account myAccount = new Account(1000.0);
        myAccount.deposit(5000.0);
        System.out.println("Current balance: " + myAccount.getBalance());
    }
}
