public class CheckingAccountMenachery extends BankAccountMenachery {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccountMenachery(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS));
        }
        transactionCount = 0;
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + getBalance();
    }

    public static void main(String[] args) {

    }
}