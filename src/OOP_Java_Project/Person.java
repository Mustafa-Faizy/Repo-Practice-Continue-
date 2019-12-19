package OOP_Java_Project;

public class Person {
	//First Name, Last Name, Address, Phone Number, Age
	
	String name, lastName, address;
	int phoneNumber, age;
	
	public Person () {
		this.name="";
		this.lastName="";
		this.address="";
		this.phoneNumber=0;
		this.age=0;
	}
	public Person (String name, String lastName, String address, int phoneNumber, int age) {
		this.name=name;
		this.lastName=lastName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	public Person (String name, String lastName, int age) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
	}
	
	public String getName () {
		return name; 
	}
	public void setName (String name) {
		this.name=name;
	}
	public String getLastName () {
		return lastName; 
	}
	public void setLastName (String lastName) {
		this.lastName=lastName;
	}
	public String getAddress () {
		return address; 
	}
	public void setAddress (String address) {
		this.address=address;
	}
	public int getPhoneNumber () {
		return phoneNumber;
	}
	public void setPhoneNumber (int phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public int getAge () {
		return age;
	}
	public void setAge (int age) {
		this.age=age;
	}
	
	@Override
	public String toString () {
		return "Person data [ Name: "+ getName()+ " "+ "Last Name: " + getLastName()+ " "+
				"Address " + getAddress() + "Phone Number: " + getPhoneNumber() + " "+ 
				"Age: " + getAge();
	}
}
