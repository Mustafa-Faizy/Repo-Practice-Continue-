package OOP_First_Exercise_2;

public class Customer {
	
	private String firstName;
	private String lastName;
	int id;
	
	public Customer (){
		this.firstName ="";
		this.lastName="";
		this.id = 0;
	}
	public Customer (String firstName, String lastName, int id) {
		this.firstName =firstName;
		this.lastName=lastName;
		this.id = id;
	}
	public String getfirstName () {
		return firstName;
	}
	public void setfirstName (String newfirstName) {
		firstName=newfirstName;
	}
	public String getlastName () {
		return lastName;
	}
	public void setlastName (String newlastName) {
		lastName=newlastName;
	}
	public int getid () {
		return id;
	}
	public void setid (int newid) {
		id=newid;
	}

}
