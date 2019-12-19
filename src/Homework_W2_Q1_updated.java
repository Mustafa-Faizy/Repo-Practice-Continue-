
public class Homework_W2_Q1_updated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1.	Create a class inside your assignment package. Class name should be ‘Homework_W2_Q1’ and you need the main method. 
		2.	
		3.	Declare an array of type double that stores the GPA for the 10 students. Name of array: studentGPA. You should first declare the array in one statement and then assign GPA/values to each index of the array in separate statements. Please assign the following data to your array. 
		a.	2.1, 3.4, 4.0, 3.5, 3.8, 2.7, 2.9, 3.0, 1.9, 2.2
		4.	Print a line to console that says “*** List of Students ***”
		5.	Create a for loop that runs through the arrays and print student information as following
		a.	$lineNumber “. ” $studentName “ ---  GPA: ” $gpa_value (e.g. “1. Jack Ma --- GPA: 3.4”)
		b.	Realize that $value is signaling that it’s a variable and “” means its literal. You should format the output as the example given. Also make sure that the line number is starting from 1 and ends to 10 in the printed output.
		6.	Print a line to console that says “*** List of Students – Not using loops ***”
		7.	Print student information in the same format you printed using loop but this time you should write a statement for each line you print. It should be 10 statements/lines of code. 
		8.	Print a line to console that says “*** OK! I think I know how helpful loops are ***”
		9.	Print a line to console that says “*** Please do not ask me to print 100 lines without loops! ***”
		Challenge Section:
		1.	Print a line to console that says “”
		2.	Print a line to console that says “*** Challenge accepted! ***”
		3.	Create a double variable and assign 3.5 to it. Name of variable: searchGPA.
		4.	Loop through the array again and print the name of student in the format provided above only if the GPA is more than or equal to searchGPA.
		5.	Print another line to console that says “*** Challenge accepted AGAIN! ***”
		6.	Loop through the arrays again and print a list of all students as you did in the actual question. But if the student GPA is less than 2.0, you should add “  -- FAILED” to the end of the line, and if the student is between 2.0 and 3.0, add “  -- Passed” to the end of the line, and if above 3.5, add “  -- Passed with honor!”. If its 4.0, add “ -*-*- Alert! Geek found! Alert!”.
		Hint: Decompose the problem, try to have a pen and paper with you and draw shapes and write things that help you make sense of the problem before starting to solve it. You can also write steps that you need to take to solve the problem and then code the steps 1 by 1. Good Luck!
*/
		
		
		//declare array of students full name
		
		//String StudentNames;
		
		//initialize the Student names and assign the values
		 String StudentNames [][] = {
				{"Mike", "Shell"},
				{"Chris", "Cher"},
				{"Mia", "Shell"},
				{"Tim", "Cher"},
				{"Seline", "Shell"},
				{"Safi", "Cher"},
				{"Hu", "Shell"},
				{"Gloris", "Cher"},
				{"JOhn", "Shell"},
				{"Carl", "Cher"},
		};
		 //declare double array of Student GPA 
		 //double studentGPA;
		 //initialize double Student Gpa and assign the value
		 
		 double [] studentGpa = {2.1, 3.4, 4.0, 3.5, 3.8, 2.7, 2.9, 3.0, 1.9, 2.2};
		 
		 System.out.println("******List of Students*****");
		 
		 //Create a for loop that runs through the arrays and print student information as following
		//	a.	$lineNumber “. ” $studentName “ ---  GPA: ” $gpa_value (e.g. “1. Jack Ma --- GPA: 3.4”)
		 
		 for (int sName = 0; sName<StudentNames.length; sName++) {
			 for (int sGpa = 0; sGpa<StudentNames.length; sGpa++) {
				 System.out.println(StudentNames [sName][sGpa]);
			 }
		 }
	}

}
