package OOP_Java_Project;

public class SUV extends Car {
	
	public SUV () {
		super();
	}
	
	public SUV (String name, String model, int maxspeed, String owner, double mpg, 
			int currentSpeed, boolean engineStatus) {
		super(name, model, maxspeed, owner, mpg, currentSpeed, engineStatus);
	}

	public SUV (String name, String make, String model, int maxSpeed, int year, String owner, 
			double mpg, int currentSpeed, boolean engineStatus) {
		super(name, make, model, maxSpeed, year, owner, mpg, currentSpeed, engineStatus);
	}
	
	public String getName () {
		return super.getName();
	}
	public void setName (String newName) {
		super.setName(newName);
	}
	public String getMake () {
		return super.getMake();
	}
	public void setMake (String newMake) {
		super.setMake(newMake);
	}
	public String getModel () {
		return super.getModel();
	}
	public void setModel (String newModel) {
		super.setModel(newModel);
	}
	public int getMaxSpeed () {
		return super.getMaxSpeed();
	}
	public void setMaxSpeed (int newMaxSpeed) {
		super.setMaxSpeed(newMaxSpeed);
	}
	public int getYear () {
		return super.getYear();
	}
	public void setYear (int newYear) {
		super.setYear(newYear);
	}
	public String getOwner () {
		return super.getOwner();
	}
	public void setOwner (String newOwner) {
		super.setOwner(newOwner);
	}
	public double getMpg () {
		return super.getMpg();
	}
	public void setMpg (double newMpg) {
		super.setMpg(newMpg);
	}
	public int getCurrentSpeed () {
		return super.getCurrentSpeed();
	}
	public void setCurrentSpeed (int newCurrentSpeed) {
		super.setCurrentSpeed(newCurrentSpeed);
	}
	public boolean getEngineStatus () {
		return super.getEngineStatus();
	}
	public void setEngineStatus (boolean newEngineStatus) {
		super.setEngineStatus(newEngineStatus);
	}
	@Override
	public String toString () {
		return "SUV data [SUV Name: " + super.getName()+ " "+ "Make"+ super.getMake()+ " " + "Model" + 
	super.getModel()+ " " + "Max Speed "+ super.getMaxSpeed()+ " "+ "Year: " + super.getYear() + " "+ "Owner Name: "+ super.getOwner()+ 
	"Mpg " + super.getMpg() + "Current Speed " + super.getCurrentSpeed()+ "Engine Status " + super.getEngineStatus();}
	
	
	
	public int breakABit () {
		return currentSpeed -=4;
	}

}
