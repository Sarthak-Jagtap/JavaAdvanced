package Questions;

/**
 * Create a class to handle specific business logic errors, such as a
 * NegativeValueException when calculating the sum of digits of a number.
 */


class NegativeValueException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public NegativeValueException(String message) {
		super(message);
	}
}



public class Ques03 {

	public static int digitSum(int num) throws NegativeValueException {
		if(num < 0) {
			throw new NegativeValueException("Negative Value not allowed");
		}
		
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
	
	
}
