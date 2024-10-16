package OOPS_2.Problem31;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance !! Current balamce is" + balance );
    }
}
