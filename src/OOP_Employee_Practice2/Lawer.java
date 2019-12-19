package OOP_Employee_Practice2;

public class Lawer extends Employee {
	private String department;
	
	public Lawer (String fullName,long date, long salary, String department ) {
		super (fullName, date,salary);
		this.department = department; 
	}

}
