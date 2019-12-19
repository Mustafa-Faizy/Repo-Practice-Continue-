package OOP_HomeExerciseEmployee;

public class RunnerEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Department d1 = new Department("Finance");
	Department d2 = new Department ("Internationl");
	
	Employee e1 = new Employee("Marin", 23650.0);
	Employee e2 = new Employee("Donald", 65624.0);
	
	d1.addlistOfEmployee(e1);
	d1.addlistOfEmployee(e2);
	
	d1.getOverSalary();
	
	for (Employee emp : d1.getOverSalary()) {
		System.out.println(emp.getName()+" "+ emp.getSalary());
	}
	
	
	}
	
	

}
