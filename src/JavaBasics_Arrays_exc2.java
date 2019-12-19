
public class JavaBasics_Arrays_exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//you create 3 arrays, firstName, ages, LastNames, 5 people
		
		//declare 3 different arrays first
		
		String firstName [];
		String lastName[];
		int age [];
		
		//initialize the arrays separatly
		String firstNames [] = new String [5];
		firstNames [0] = "Bob";
		firstNames [1] = "John";
		firstNames [2] = "Mike";
		firstNames [3] = "TOm";
		firstNames [4] = "Tim";
				
		String lastNames [] = new String [5];
		
	    lastNames [0] = "Bo";
		lastNames [1] = "Jon";
		lastNames [2] = "Mie";
		lastNames [3] = "TO";
		lastNames [4] = "Ti";
		
		int ages [] = new int [5];
		
		ages [0] = 5;
		ages [1] = 10;
		ages [2] = 15;
		ages [3] = 20;
		ages [4]= 25; 
		
		System.out.println(firstNames [2] + " " + lastNames [3] + " " + "is" + " " + ages [2] + " " + "years old"); 
		
		System.out.println("2 dimension");
		
		int first2DArray [] [] = new int [4] [7];

		first2DArray [0] [0] = 1;
		first2DArray [0] [1] = 2;
		first2DArray [0] [2] = 3;
		first2DArray [0] [3] = 4;
		first2DArray [0] [4] = 5;
		first2DArray [0] [5] = 6;
		first2DArray [0] [6] = 7;
		
		first2DArray  [1] [0]= 11;
		first2DArray [1] [1] = 22;
		first2DArray [1] [2] = 31;
		first2DArray [1] [3] = 34;
		first2DArray [1] [4] = 11;
		first2DArray [1] [5] = 52;
		first2DArray [1] [6] = 65;
		
		int rownum = 1;
		int colnum = 0; 
		System.out.println(first2DArray[rownum][colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " "
				+ first2DArray[rownum][++colnum] + " ");
		
		
	}

}
