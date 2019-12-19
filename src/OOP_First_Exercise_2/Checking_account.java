package OOP_First_Exercise_2;

public class Checking_account extends Customer {
//every customer : All of them needs same info
	
	private double checkingBalance;
	private int id;
	
	public Checking_account (double checkingBalance, int id, String firstName, String lastName) {
		super (firstName, lastName, id);
		
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance (double checkingBalance) {
		this.checkingBalance=checkingBalance;
	}
	public int getid() {
		return id;
		}
	public void setid (int newid) {
		id=newid;
		
	}
	
	
}
