package OOP_ExeceptionHandling;

public class ExeceptionHandling {
	
	public static int divide (int a, int b) {
		return a/b;
	}

	
	public static void main(String[] args) {
		
		//I don't have to create object
		int x = 0;
		
		try {
			x=divide (10,0);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println(x);
	}
}
