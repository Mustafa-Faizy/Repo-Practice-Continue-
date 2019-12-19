
public class FirstClassCreate {

	public static void main(String[] args) {

		// x is 20 (21), (30)
		// y is 30
		
		String text1 = "This is the first text I created in Java";

		int x = 20;

		x = 21;
		System.out.println(text1 + " " + x);

		int y = 30;

		x = y; 
		
		System.out.println(x + y + " " + text1);

		// int z = x / 0;

		System.out.println(text1 + x);
	}

}
