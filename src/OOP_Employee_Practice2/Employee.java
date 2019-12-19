package OOP_Employee_Practice2;

public class Employee {
	
	private String mFullName;
	private long mEmploymentDate;
	private double mSalary;
	
	
public Employee () {
	mFullName = "";
	mEmploymentDate = 0;
	mSalary = 0;
}
		
	public Employee (String fullname, long date, long salary) {
		mFullName = fullname;
		mEmploymentDate = date;
		mSalary = salary;
	}
	
	public String getFullName () {
		return mFullName;
	}
	public void setfullName (String newFullname) {
		mFullName = newFullname;
	}

	public long getDate () {
		return mEmploymentDate;
	}
	public void setDate (long newDate) {
		mEmploymentDate = newDate;
	}
	public double getSalary () {
		return mSalary;
	}
	public void setSalary(double newSalary) {
		mSalary = newSalary;
	}
	public void statusTotalSalary (double totalSalary) {
		if (totalSalary>2000) {
			System.out.println("you need to save money");
					}
		else {
			System.out.println("You can hire new person");
		}
	}
}
