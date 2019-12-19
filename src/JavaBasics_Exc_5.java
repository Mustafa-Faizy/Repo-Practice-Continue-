
public class JavaBasics_Exc_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an 2D array
	String StudentsInfo [] [] = new String [5][4];
	
	StudentsInfo [0][0] = "David";
	StudentsInfo [1][0] = "John";
	StudentsInfo [2][0] = "Marcia";
	StudentsInfo [3][0] = "Tracy";
	StudentsInfo [4][0] = "Jema";
	
	StudentsInfo [0][1] = "Miller";
	StudentsInfo [1][1] = "Smith";
	StudentsInfo [2][1] = "Occomy";
	StudentsInfo [3][1] = "Lane";
	StudentsInfo [4][1] = "Cabrias";
	
	StudentsInfo [0][2] = "73";
	StudentsInfo [1][2] = "84";
	StudentsInfo [2][2] = "91";
	StudentsInfo [3][2] = "68";
	StudentsInfo [4][2] = "56";
	
	//create loop for students info
	int grade = 0;
	
	for (int i = 0; i<StudentsInfo.length; i++) {
		//convert students info about score to integer
		grade = Integer.valueOf(StudentsInfo [i][2]);
	
	if (grade >90 && grade<100) {
		StudentsInfo[i][3] = "A";
		}	
	else if (grade > 80 && grade<89) {
		StudentsInfo[i][3] ="B";}
	
	else if (grade > 70 && grade<79) {
		StudentsInfo[i][3] ="C";}
	
	else if (grade > 60 && grade<69) {
		StudentsInfo[i][3] ="D";}
	
	
	else if ( grade<60) {
		StudentsInfo[i][3] ="F";}
	
	else { 
		System.out.println(" ");}
	
	
	}
	
	String Message = " ";
	
	for (int i= 0; i<StudentsInfo.length; i++) {
		
		if (StudentsInfo [i][3].equals('A')) {
			Message = "Excellent";}
				
		else if  (StudentsInfo [i][3].equals('B')) {
			Message ="Good Job";}
		
		else if  (StudentsInfo [i][3].equals('C') ) {
			Message ="Keep up the hard work!";}
		
		else if  (StudentsInfo [i][3].equals('D') ||
				StudentsInfo [i][3].equals('F') ) {
			Message ="Try Harder";}
		else {
			Message = " ";
		}
		System.out.println(StudentsInfo [i][0] + " " +
				StudentsInfo [i][1] + " \t"  +StudentsInfo [i][2]+ " "+ 
				StudentsInfo [i][3]+ " " +  " " + Message);
	}
	}

}
