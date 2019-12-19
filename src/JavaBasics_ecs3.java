
public class JavaBasics_ecs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age [] [] = new int [4] [5];
		
		age [0] [0] = 1;
		age [0] [1] = 2;
		age [0] [2] = 3;
		age [0] [3] = 5;
		age [0] [4] = 7;
		
		age [1] [0] = 23;
		age [1] [1] = 29;
		age [1] [2] = 3;
		age [1] [3] = 5;
		age [1] [4] = 49;
		
		
	 
		age [2] [0] = 37;
		age [2] [1] = 26;
		age [2] [2] = 7;
		age [2] [3] = 90;
		age [2] [4] = 69;
		
		
		age [3] [0] = 3;
		age [3] [1] = 7;
		age [3] [2] = 87;
		age [3] [3] = 29;
		age [3] [4] = 31;
		
		int rownum = 0;
		int column = 0;
		System.out.println(age [rownum] [column] + " " +
				           age [rownum] [++column] + " " 
				         + age [rownum] [++column] + " "
						 + age [rownum] [++column] + " "
				         + age [rownum] [++column])
		;
		
		int rownum1 = 1;
		int column1 = 0;
		System.out.println(age [rownum1] [column1] + " " +
				           age [rownum1] [++column1] + " " 
				         + age [rownum1] [++column1] + " "
						 + age [rownum1] [++column1] + " "
				         + age [rownum1] [++column1]);
		
		int rownum2 = 2;
		int column2 = 0;
		System.out.println(age [rownum2] [column2] + " " +
				           age [rownum2] [++column2] + " " 
				         + age [rownum2] [++column2] + " "
						 + age [rownum2] [++column2] + " "
				         + age [rownum2] [++column2]);
		
		int rownum3 = 3;
		int column3 = 0;
		System.out.println(age [rownum3] [column3] + " " +
				           age [rownum3] [++column3] + " " 
				         + age [rownum3] [++column3] + " "
						 + age [rownum3] [++column3] + " "
				         + age [rownum3] [++column3]);
		
		
		
		/*int table [] [] = new int [4] [5] ;
		
		int rowNum = 0;
		int colNum = 0;
		 
		table [rowNum] [colNum] = 1;
		table [rowNum] [++colNum] = 2;
		table [rowNum] [++colNum] = 3;
		table [rowNum] [++colNum] = 7;
		table [rowNum] [++colNum] = 5;
		
		
		rowNum = 1;
		colNum = 0; 
		
		table [rowNum] [colNum] = 11;
		table [rowNum] [++colNum] = 32;
		table [rowNum] [++colNum] = 32;
		table [rowNum] [++colNum] = 72;
		table [rowNum] [++colNum] = 55;
		
		rowNum = 2;
		colNum = 0; 
		
		table [rowNum] [colNum] = 25;
		table [rowNum] [++colNum] = 132;
		table [rowNum] [++colNum] = 322;
		table [rowNum] [++colNum] = 723;
		table [rowNum] [++colNum] = 555;
		
		rowNum = 3;
		colNum = 0; 
		
		table [rowNum] [colNum] = 111;
		table [rowNum] [++colNum] = 232;
		table [rowNum] [++colNum] = 332;
		table [rowNum] [++colNum] = 723;
		table [rowNum] [++colNum] = 553;
		
		
		
		
		System.out.println(table [0] [0] + " " + table [0] [1] )*/
		System.out.println("**********************");
		
		String print = ""; 
		for (int i = 0; i<4; i++) {
			for (int j=0; j<5; j++) {
				if (age [i][j] < 10) {
					System.out.print("0" + age [i][j] + " ");}
				else {
					System.out.print(age [i] [j] + " " );
				}
		 
				System.out.print(print + " ");
				
			
			}
	System.out.println();
		}
		
			
		
	}

}
