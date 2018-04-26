import java.util.Scanner;

@FunctionalInterface
interface myNewInterface {
	public abstract void show();
//	void greet(String message);
}

public class ManualException extends Exception implements myNewInterface {

	private static final long serialVersionUID = 1L;

	public ManualException() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter the First Number ");
			Integer firstNumber = new Integer(scanner.nextInt());
		
			System.out.println("Enter the Second Number ");
			Integer secondNumber = new Integer(scanner.nextInt());
			
			Integer result = new Integer(divideNumbers(firstNumber, secondNumber));
			
			myNewInterface obj = () -> {	System.out.println("The result is " + result);	}; //lambda expression
			
			obj.show();

			
		
		
		}
		catch (Exception exception){
			// exception.printStackTrace();

			System.out.println(exception.getMessage());
		}
		finally {
			scanner.close();
		}

	}
	
	public static void main(String[] args) {
		new ManualException();
			
	}
	
	public int divideNumbers(int firstNumber, int secondNumber) throws ArithmeticException{

		if(0 == secondNumber) {
			 throw new ArithmeticException("Attempt made to Divide By Zero");
		}
		else {
			return firstNumber/secondNumber;
		}
	}
	
}
