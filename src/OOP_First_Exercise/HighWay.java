package OOP_First_Exercise;

import java.awt.FontFormatException;
import java.util.ArrayList;

public class HighWay {
//name //speedLimit //listOfCars on the road

	String name;
	double speedLimit;
	ArrayList <Car> carsOfRoad;
	
	public HighWay () {
		this.name="";
		this.speedLimit=0;
		carsOfRoad =new ArrayList <Car>();//we created class car, that's why ArrayList it will be list of car
	}
	
	public HighWay (String name, double speedLimit, ArrayList <Car> carsOfRoad) {
// has list of cars on the roads
	this.name=name;
	this.speedLimit = speedLimit;
	this.carsOfRoad= carsOfRoad;
	}
	public HighWay (String name, double speedLimit) {

		this.name=name;
		this.speedLimit = speedLimit;
		carsOfRoad= new ArrayList <Car> ();
		}
	

	public String getName () {
		return name;
	}

	public void setName (String newName) {
		name=newName;
	}
	public double getSpeedLimit () {
		return speedLimit;
	}

	public void setSpeedLimit (double newSpeedLimit) {
		speedLimit=newSpeedLimit;
	}
	public ArrayList <Car> getCarsOfRoad () {
		return carsOfRoad;
	}

	public void setCarsOfRoad (ArrayList <Car> carsOfRoad) {
		this.carsOfRoad = carsOfRoad;
	}

	//create the method that to add cars on road
	public void addcarsOfRoad (Car newCar){//I should take a car and add it
		carsOfRoad.add(newCar);//adding a car to the list (//name of the list.element)
	}
//method adding a car which have overspeed in the overspeed list
	public ArrayList<Car> getOverSpeed (){
		
		ArrayList <Car> overSpeed = new ArrayList <Car>();
		
		//give us list of cars which is overspeed
	//to go to through of list using for loop

	for (Car cr : carsOfRoad) {
		if (cr.getCurrentSpeed() > speedLimit) {
			overSpeed.add(cr);
				}
	}
		return overSpeed;
		
		}
}

	



