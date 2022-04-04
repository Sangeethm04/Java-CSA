public class BankAccount {
   private double balance;

   public BankAccount() {
      balance = 0;
   }

   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      balance -= amount;
   }

   public double getBalance() {
      return balance;
   }

   public void transfer(BankAccount other, double amount) {
      withdraw(amount);
      other.deposit(amount);
   }

   public String toString() {
      return "Balance toString: The balance of Bank Account is $" + balance;
   }
}