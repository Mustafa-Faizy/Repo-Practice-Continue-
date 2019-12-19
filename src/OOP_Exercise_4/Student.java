package OOP_Exercise_4;

public class Student {
	
	private String firstName;
	private String lastName;
	private static int numberOfStudents=0;
	
	

	public Student (String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		numberOfStudents++;
	}
	
	
	@Override 
	public String toString() {
		return "Student data [first Name " + firstName + "last Name"+lastName
		+ "number of Students" + numberOfStudents;
	
		}
	
	//public static void numberOfStudentsInTheSystem () {
	//	System.out.println("Student data "  + numberOfStudents);
	//}
}
