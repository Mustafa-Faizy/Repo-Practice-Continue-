package OOP_Java_Project;

public class Bike extends Vehicle {
	
	public Bike () {
		super();
		
	}
	public Bike (String name, String make, String model, int maxSpeed, int year, String owner) {
		super(name, make, model, maxSpeed, year, owner);
				
	}

	public Bike (String name, String model, int maxSpeed, String owner) { 
		super(name, model, maxSpeed, owner);
	}
	
	public String getName () {
		return super.getName();
	}
	public void setName (String name) {
		super.setName(name);
	}
	public String getMake () {
		return super.getMake();
	}
	public void setMake (String make) {
		super.setMake(make);}
	
	public String getModel () {
		return super.getModel();
	}
	public void setModel (String model) {
		super.setModel(model);}
	
	public int getMaxSpeed () {
		return super.getMaxSpeed();
	}
	public void setMaxSpeed (int maxSpeed) {
		super.setMaxSpeed(maxSpeed);}
	
	public int getYear () {
		return super.getYear();
	}
	public void setYear (int year) {
		super.setYear(year);}
	
	public String getOwner () {
		return super.getOwner();
	}
	public void setOwner (String owner) {
		super.setOwner(owner);}
	
	@Override
	public String toString () {
		return "Bike data [Bike Name: "+ super.getName() +" "+ "Bike make "+ super.getMake()+ " "+
	"Model: "+ super.getModel()+ " "+ "Max Speed: " + super.getMake() + " "+ "Year: " + super.getYear()+ " "+
				"Owner name: " + super.getOwner(); 
	}
	
	//reduce speed by 2
	int currentSpeed;
	public int breakABit () {
		return currentSpeed -=2;
	}
	public boolean getbreak () {
		return currentSpeed == 0;}
	
}
