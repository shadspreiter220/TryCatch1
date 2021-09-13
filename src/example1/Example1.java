package example1;

public class Example1 {

	public static void main(String[] args) {
		int num1, num2;
		try {
			num1=0;
			System.out.println("Sending the Exception");
			num2=62/num1;
			System.out.println(num2);
			  }
		catch(ArithmeticException e) {
			//This block will only execute if any Arithmetic exception 
			//occurs in try block
			System.out.println("We can't divide any number by zero");
	    }
		catch(Exception e) {
			//This is a generic Exception handler which means it can handle 
			//all the exceptions.  This will execute if the exception is not 
			//handled by previous catch blocks. 
			System.out.println("Exception occurred");
		}
			System.out.println("Try-Catch ended.");
	}

}
