package OOP_Employee_Practice2;

public class Doctor extends Employee {
    private int category;
    public Doctor () {
    	super();
    	this.category=category;
    }
    
    public Doctor (String fullName, long date, long salary, int category)
    {
    	super (fullName, date, salary);
    	this.category=category;
    }
    
    public int getcategory () {
    	return category;
    }
    public void setcategory (int newcategory) {
    	category = newcategory;
    }
    @Override
    
    public double getSalary () {
    	return (double) super.getSalary()* 1.2;
    }

    



}


