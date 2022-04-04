public class BankAccountTester {
	public static void main(String[] args) {

		SavingsAccount test1 = new SavingsAccount(5);
		test1.deposit(1000);
		test1.addInterest();
		test1.addInterest();
		System.out.println("Test1 balance should be $1102.50, and it is " + test1.getBalance());
		System.out.println(test1);


		BankAccount test2 = new BankAccount(2);
		test2.deposit(5000);
		System.out.println("\nTest2 balance should be $5000, and it is " + test2.getBalance());
		System.out.println(test2);


		CheckingAccount test3 = new CheckingAccount(10000);
		test3.deposit(1000);
		test3.withdraw(3000);
		test3.withdraw(200);
		System.out.println("\nTest3 balance should be $7800, and it is " + test3.getBalance());
		test3.deductFees();
		System.out.println("\nTest3 balance should still be $7800, and it is " + test3.getBalance());
		test3.deposit(3000);
		test3.withdraw(30);
		test3.withdraw(800);
		test3.deposit(1000);
		test3.withdraw(50);
		test3.withdraw(500);
		System.out.println("\nTest3 balance should now be $10420, and it is " + test3.getBalance());
		test3.deductFees();
		System.out.println("\nTest3 balance should now be $10414, and it is " + test3.getBalance());
		System.out.println(test3);


		CheckingAccount test4 = new CheckingAccount(4000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.deductFees();
		System.out.println("\nTest4 balance should be $-2, and it is " + test4.getBalance());
		System.out.println(test4);

	}
}