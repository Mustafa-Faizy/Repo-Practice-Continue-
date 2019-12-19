package OOP_Interview_ques_Naveen;

public class reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse a String
		//difference between String and StringBuffer
		//do we have reverse function in String (No)
		//I have a String
		String str = "Selenium";
		//we should create int with length variable
		int len = str.length();//it will give me length of the string
		char [] ch = str.toCharArray();//whatever character i have, give me value of character
		for (int i=len-1; i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
		//second method using for loop
		String rev = "";
		//length is 8, then we should put >=0 (zero will be included)
		for (int y = len-1; y>=0; y--) {
			rev = rev + str.charAt(y);
			System.out.println(rev);
		}
		System.out.println(rev);
		
		//3 way using StringBuffer class
		StringBuffer sf = new StringBuffer (str);
		System.out.println(sf.reverse());
		
	}

}
