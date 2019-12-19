package OOP_ExeceptionHandling;

public class ThrowExceptionHandling {

	
	public static int divide (int a, int b) throws ArrayIndexOutOfBoundsException {
	return a/b;}
	
	public static void printIndexValue (int i) {//pass this Index of value and print the index
		/*try {
		String [] test = {"data1","data2","data3"};
	System.out.println(test[i]);
	
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("the index is out of boundry");}
	}*/
	
		String [] test = {"data1","data2","data3"};
	System.out.println(test[i]);}
		
	
		
	
	public static void main (String[] args) {

		/*//throw
		int x = 0;
		
		try {
			x=divide (10,0);
		}
		catch (ArithmeticException e) {
			throw e;//if we put throw then this exception occur
			//it would't run after that
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("end of the code");//if we don't put throw this code gonna run
		System.out.println(x);
	}*/
		
		//System.out.println(divide(10,0));
		try {
		printIndexValue(3);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I got it");}
		}
		
		
		
}
