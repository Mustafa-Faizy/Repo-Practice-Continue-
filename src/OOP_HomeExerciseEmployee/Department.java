package OOP_HomeExerciseEmployee;

import java.util.ArrayList;

public class Department {
	
	String name;
	ArrayList <Employee> listOfEmployee;

	public Department (){
		this.name="";
		ArrayList <Employee> listOfEmployee;
	}
	public Department (String name, ArrayList <Employee> listOfEmployee ) {
		this.name=name;
		this.listOfEmployee = listOfEmployee;
	}
	public Department (String name ) {
		this.name=name;
		listOfEmployee = new ArrayList <Employee> ();
	}

	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name=name;
	}
	public ArrayList<Employee> getListOfEmployee (){
		return listOfEmployee;
	}
	public void setlistOfEmployee ( ArrayList<Employee>listOfEmployee) {
		this.listOfEmployee =  listOfEmployee;
}
	public void addlistOfEmployee (Employee newEmployee  ) {
		listOfEmployee.add(newEmployee);
	}
	public ArrayList <Employee> getOverSalary (){
	 ArrayList <Employee> overSalary = new ArrayList <Employee> ();
	
	
	for (Employee emp : listOfEmployee) {
		if (emp.getSalary()>2000.0) {
			overSalary.add(emp);
		}
	}
	return overSalary; }
	}
	
