//Sangeeth Menachery
//Exercise 4.2
//changing numbers for sum factorial etc

public class FunNumberMenachery {

	private int original;

	/*
	 * constructs a FunNumber with value num
	 */
	public FunNumberMenachery(int num) {
		original = num;
	}

	/*
	 * counts the digits in this FunNumber value
	 * 
	 * @return the number of the digits
	 */
	public int numDigits() {
		int length = String.valueOf(original).length();
		return length;
	}

	/*
	 * sums the digits in this FunNumber value
	 * 
	 * @return the sum of the digits
	 */
	public int sumDigits() {
		int sum = 0;
		for (int x = 0; x < String.valueOf(original).length(); x++) {
			sum = sum + Integer.parseInt(String.valueOf(original).substring(x, x + 1));
		}
		return sum;
	}

	/*
	 * creates a sum of the integers that are less than or equal to this FunNumber
	 * value
	 * 
	 * @return the sum of the integers <= this FunNumber value
	 */
	public int sumInts() {
		int additon = 0;
		for (int b = 1; b <= original; b++) {
			additon += b;
		}
		return additon;
	}

	/*
	 * determines the factorial of this FunNumber value
	 * 
	 * @return this FunNumber value's factorial
	 */
	public int findFactorial() {
		int factorial = 1;
		for (int b = 1; b <= original; b++) {
			factorial *= b;
		}
		return factorial;

	}

	/*
	 * prints all of the factors of this FunNumber value
	 */
	public void printFactors() {

		String factors = "";
		for (int i = 1; i <= original; i++) {
			if (original % i == 0) {
				factors += i + ",";
			}
		}
		System.out.println(factors);
	}

	/*
	 * determines if this FunNumber value is prime
	 * 
	 * @return true if this value is prime, false otherwise
	 */
	public boolean isPrime() {

		// Check from 2 to n-1
		for (int i = 2; i < original; i++)
			if (original % i == 0)
				return false;

		return true;
	}

	/*
	 * returns true if this FunNumber value is a "perfect" number
	 * (a perfect number is a number that has a sum of proper factors equal to the
	 * value
	 * of this number. 6 is a perfect number because 6 = 1 + 2 + 3.)
	 * 
	 * @ return true if this FunNumber value is a perfect number, false otherwise.
	 */
	public boolean isPerfect() {
		int factors = 0;
		for (int i = 1; i < original; i++) {
			if (original % i == 0) {
				factors += i;
			}
		}
		if (factors == original) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * returns a number that is the reverse of this FunNumber
	 * 
	 * @return reverse of this FunNumber
	 */
	public String reverseNum() {
		int reverse = 0;
		String newdigit = "";
		for (int i = 0; i < String.valueOf(original).length(); i++) {
			reverse = (int)(Integer.parseInt(String.valueOf(original).substring(i, i + 1)));
			newdigit = reverse + newdigit;
		}
		return newdigit;

	}

	/*
	 * returns the value of this FunNumber
	 * 
	 * @return value of this FunNumber
	 */
	public int getValue() {
		return original;
	}

	public static void main(String[] args) {
		FunNumberMenachery uno = new FunNumberMenachery(10);
		System.out.println(uno.numDigits() + " a");
		System.out.println(uno.sumDigits() + " b");
		System.out.println(uno.sumInts() + " c");
		System.out.println(uno.findFactorial() + " d");
		uno.printFactors();
		System.out.println(uno.isPrime() + " f");
		System.out.println(uno.isPerfect() + " g");
		System.out.println(uno.reverseNum() + " h");
		System.out.println(uno.getValue() + " i");
	}
}