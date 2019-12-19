package OOP_First_Exercise;

public class Car {
//make //model  //year //color // type
// owner name // passengers // currentSpeed

	private String make;
	private String model;
	private int year;
	private String color;
	private String type;
	private String ownerName;
	private int passenger;
	private double currentSpeed;
	
    public Car () {
	this.make = "";
	this.model="";
	this.year=0;
	this.color="";
	this.type="";
	this.ownerName="";
	this.passenger=0;
	this.currentSpeed=0;}
	
	
	public Car(String make, String model ,int year, String color, String type, 
			String ownerName, int passenger, double curretnSpeed) {
		this.make = make;
		this.model=model;
		this.year=year;
		this.color=color;
		this.type=type;
		this.ownerName=ownerName;
		this.passenger=passenger;
		this.currentSpeed=currentSpeed;
	}
	
public String getMake () {

	return make;
}
public void setMake (String newMake) {
	make=newMake;
}

public String getModel () {

	return model;
}
public void setModel (String newModel) {
	model=newModel;
}
public int getYear () {

	return year;
}
public void setYear (int newYear) {
	year=newYear;
}
public String getColor () {

	return color;
}
public void setColor (String newColor) {
	color=newColor;
}
public String getType () {

	return type;
}
public void setType (String newType) {
	type=newType;
}
public String getOwnerName () {

	return ownerName;
}
public void setOwnerName (String newOwnerName) {
	ownerName=newOwnerName;
}
public int getPassenger () {

	return passenger;
}
public void setPassenger (int newPassenger) {
	passenger=newPassenger;
}
public double getCurrentSpeed () {

	return currentSpeed;
}
public void setCurrentSpeed (double newCurrentSpeed) {
	currentSpeed=newCurrentSpeed;
}





}





