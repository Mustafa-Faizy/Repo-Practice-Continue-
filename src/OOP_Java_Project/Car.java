package OOP_Java_Project;

public class Car extends Vehicle {

	//Mpg, current speed, engine status.
	
	double mpg;
	int currentSpeed;
	boolean engineStatus;
	
	public Car (){
		super();
		this.mpg=0;
		this.currentSpeed=0;
		this.engineStatus=false;
	}
	public Car (String name, String make, String model,  int maxSpeed, 
			int year, String owner, double mpg, int currentSpeed, boolean engineStatus) {
		super(name, make, model, maxSpeed, year, owner);
	
	this.mpg=mpg;
	this.currentSpeed = currentSpeed;
	this.engineStatus = engineStatus;
	}
	public Car (String name, String model, int maxSpeed,  String owner, double mpg, int currentSpeed, boolean engineStatus ) {
		super(name, model, maxSpeed, owner);
		this.mpg=mpg;
		this.currentSpeed = currentSpeed;
		this.engineStatus = engineStatus;
	}
	
	public double getMpg () {
		return mpg;
	}
	public void setMpg (double mpg) {
		this.mpg = mpg;
	}
	public int getCurrentSpeed () {
		return currentSpeed;
	}
	public void setCurrentSpeed (int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public boolean getEngineStatus () {
		return engineStatus;
	}
	public void setEngineStatus (boolean engineStatus) {
		this.engineStatus = engineStatus;
	}
	@Override
	public String toString () {
		return "Car data [Name: " + getName() + " "+ "Make:"+ getMake() + " " + "Model: "+ getModel() + " "+
	"Max speed " + getMaxSpeed() + "Year: "+ getYear()+ " "+ "Owner name: " + getOwner() + " "+ "Mpg " + getMpg() + " "+
	"Curent Speed: " + getCurrentSpeed() + " " + "Engine Status: " + getEngineStatus()+ "\n";
	}
	//reduce the speed by 5
	public int breakABit () {
		return	currentSpeed -=5;
		}
	//method speed =0;
	
	public boolean getBreak () {
		return currentSpeed ==0;
	} 
	//method StartEngine=true
	
	public boolean getStartEngine () {
		return engineStatus == true;
	}
	int OffEngine = 0;
	public boolean getOffEngine () {
		return engineStatus == false;
	}
	//method SpeedUp increase speed
	
	public void speedUp (int newSpeedUp) {
	currentSpeed += newSpeedUp;
		
	}
}
