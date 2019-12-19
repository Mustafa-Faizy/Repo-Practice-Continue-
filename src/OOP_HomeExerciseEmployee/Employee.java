package OOP_HomeExerciseEmployee;

public class Employee {
	
	String name;
	double salary;
	
	public Employee () {
		this.name = "";
		this.salary=0;
	}
	public Employee (String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getName () {
		return name;
	}
public void setname (String name) {
	this.name=name;
}
public double getSalary () {
	return salary;
}
public void setSalary (double salary) {
this.salary=salary;
}
}
