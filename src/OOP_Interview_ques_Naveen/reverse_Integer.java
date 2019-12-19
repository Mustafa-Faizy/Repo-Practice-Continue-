package OOP_Interview_ques_Naveen;

public class reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using algoritm
		int num = 12345;
		int rev =0;
		
		while (num !=0) {
			rev = rev*10 + num / 10;
			num =num / 10;
		}
		System.out.println("reverse int is :" + rev);		
	
	//2. using StringBuffer method
		int num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	
	
	
	
	
	}

}
