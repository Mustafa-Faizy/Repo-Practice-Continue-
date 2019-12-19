
public class HomeWork_W2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//declare studentsName and GPA
		
	String Studentsname;
	double studentGPA;   
	
    
	     // initialize the value and create 2D Array
	
	String StudentNameAndGPA [] [] = new String [10] [2];
	
	StudentNameAndGPA[0] [0]= "John Ma";
	StudentNameAndGPA [1] [0]= "Jo LOL";
	StudentNameAndGPA [2] [0]= "Bon Breg";	
	StudentNameAndGPA [3] [0]= "Bran Ki";
	StudentNameAndGPA[4] [0]= "Safi Lor";
	StudentNameAndGPA [5] [0]= "Tim Durden";
	StudentNameAndGPA [6] [0]= "Elin Kris";
	StudentNameAndGPA [7] [0]= "Mike Talk";
	StudentNameAndGPA [8] [0]= "Lory Bin";
	StudentNameAndGPA[9] [0]= "Georg Like";
	

	
		//assign value for each GPA statement
	
	 
	
	StudentNameAndGPA [0] [1] = "2.1";
	StudentNameAndGPA[1][1] = "3.4";
	StudentNameAndGPA [2] [1]= "4.0";
	StudentNameAndGPA [3] [1]= "3.5";
	StudentNameAndGPA[4] [1]= "3.8";
	StudentNameAndGPA [5] [1]= "2.7";
	StudentNameAndGPA [6] [1]= "2.9";
	StudentNameAndGPA[7] [1]= "3.0";
	StudentNameAndGPA[8] [1]= "1.9";
	StudentNameAndGPA [9] [1]= "2.2";
	
	
	
	
	 
	System.out.println("********List of Students*******");
	System.out.println();
	// create for loop and print it
	for (int i = 0; i<StudentNameAndGPA.length; i++) {
		System.out.println((i+1)+  ". " + StudentNameAndGPA [i][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [i][1]);
	}
	//create manual 2D array through println
	System.out.println();
		System.out.println("*** List of Students – Not using loops***");
		System.out.println();
		System.out.println("1. "+ StudentNameAndGPA [0][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [0][1] +
				"\n" + "2. "+ StudentNameAndGPA [1][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [1][1] +
				"\n" + "3. "+ StudentNameAndGPA [2][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [2][1] +
				"\n" + "4. "+ StudentNameAndGPA [3][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [3][1] +
				"\n" + "5. "+ StudentNameAndGPA [4][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [4][1]+
		"\n" + "6. "+ StudentNameAndGPA [5][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [5][1] +
		"\n" + "7. "+ StudentNameAndGPA [6][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [6][1] +
		"\n" + "8. "+ StudentNameAndGPA [7][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [7][1] +
		"\n" + "9. "+ StudentNameAndGPA [8][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [8][1] +
		"\n" + "10. "+ StudentNameAndGPA [9][0] +  "\t" +"GPA" +"---" + "\t"+ StudentNameAndGPA [9][1]);
	
	System.out.println();
	System.out.println("*** OK! I think I know how helpful loops are ***");
	System.out.println();
	System.out.println("*** Please do not ask me to print 100 lines without loops! ***");
	
System.out.println("");
System.out.println("*** Challenge accepted! ***");


     //double searchGpa = 3.5;
       double gpa = 3.5;
       System.out.println("*** Challenge accepted AGAIN! ***");
     
     for (int sNames = 0; sNames<StudentNameAndGPA.length; sNames++) {
    	 for (int sGpa = 0; sGpa<StudentNameAndGPA [sNames].length; sGpa++)
    		 System.out.print(StudentNameAndGPA[sNames][sGpa] + "\t"  );
    		 gpa = Double.valueOf(StudentNameAndGPA[sNames][1]);
    		 
    	 //if (gpa>3.5 || gpa == 3.5)
    		 
    	 if ( gpa == 3.5) {
    		System.out.println( "\t" + 
    		"-- Passed with honor!");}
    	 
    	 
    		else if (gpa<2.0) {
        		System.out.println("\t"+
        	    		"-- FAILED");}
    		else if (gpa>2.0 && gpa<3.0) {
        		System.out.println("\t"+
        	    		"	-- Passed ");}
    		else if (gpa==4.0 ) {
        		System.out.println("\t"+
        	    		"	-*-*- Alert! Geek found! Alert!");}
    	 
    	 		
    		else {
    			System.out.println(" ");
    				 	 
    		}
    
     }
		
			
	}
}
		
	
		
	



