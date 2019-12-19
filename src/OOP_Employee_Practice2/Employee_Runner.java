package OOP_Employee_Practice2;

public class Employee_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//polymorphizm
		Employee [] emps = new Employee [3];
		emps [0] = new  Doctor ("Jack", 1234, 300, 1);
		emps [1] = new Lawer ("Bob" , 3554, 500, "Criminal");
		emps [2] = new Lawer ("John", 5652,400,"Criminal");
		
	double totalSalary = 0;
	for (int i=0; i<emps.length; i++) {
		totalSalary += emps[i].getSalary();
	}
		
		Doctor d1 = new Doctor ("Jack", 1234, 300, 1);
		Lawer l1 = new Lawer ("Bob" , 3554, 500, "Criminal");
		
		d1.getSalary();
		l1.getSalary();
		
		//double totalSalary = (d1.getSalary()+l1.getSalary());
		
		//*System.out.println("total salary = " +totalSalary);
		//if (totalSalary>1000) {
		//	System.out.println("cvbnfd");
		
		//}
		//else {
		//	System.out.println("dkvvmdf");
		//}
	}

}
