package OOP_First_Exercise_2;

public class Saving_account extends Customer {

	// we didn't create any variables or methods
	//but automatically the Saving account class has variables
	//like firstname, lastname, id; constr.methods, get and set methods
	
	
	private double savingBalance;//const.method is initialized all the variables
	public Saving_account () {//and also I'm initializing that variables that we have in this class
		super();
		this.savingBalance = 0;
	}
	
	public Saving_account (double savingBalance, String firstName, String lastName, int id) {
				super(firstName, lastName, id);
	              this.savingBalance=savingBalance;
	}
	public double getSavingBalance () {
		return savingBalance;
	}
	@Override
	public String getfirstName () {
		System.out.println("Child Class");
		return super.getfirstName();
	}
	
	
	

	}

