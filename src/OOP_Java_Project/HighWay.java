package OOP_Java_Project;

import java.util.ArrayList;

public class HighWay {
	
	//Name, max speed limit, min speed limit, list of cars on road

	String name;
	int maxSpeedLimit, minSpeedLimit;
	ArrayList <Car> carsOnRoad;
	
	public HighWay () {
		this.name="";
		this.maxSpeedLimit=0;
		this.minSpeedLimit=0;
		this.carsOnRoad=new ArrayList <Car>();
	}
	
	public HighWay (String name, int maxSpeedLimit, int minSpeedLimit, ArrayList <Car> carsOnRoad ) {
		this.name=name;
		this.maxSpeedLimit=maxSpeedLimit;
		this.minSpeedLimit= minSpeedLimit;
		this.carsOnRoad=carsOnRoad;
		
	}
	public HighWay (String name, int maxSpeedLimit, int minSpeedLimit ) {
		this.name=name;
		this.maxSpeedLimit=maxSpeedLimit;
		this.minSpeedLimit= minSpeedLimit;
		carsOnRoad=  new ArrayList <Car> ();}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name=name;
	}
	public int getMaxSpeedLimit () {
		return maxSpeedLimit;
	}
	public void setMaxSpeedLimit (int maxSpeedLimit) {
		this.maxSpeedLimit=maxSpeedLimit;
	}
	public int getMinSpeedLimit () {
		return minSpeedLimit;
	}
	public void setMinSpeedLimit (int minSpeedLimit) {
		this.minSpeedLimit=minSpeedLimit;
	}
	public ArrayList <Car> getCarsOnRoad () {
		return carsOnRoad;
	}
	public void setCarsOnRoad (ArrayList <Car> carsOnRoad) {
		this.carsOnRoad= carsOnRoad;
	}
	@Override
	public String toString () {
		return "HighWay data: [Name: " + getName()+ "Max Speed limit "+ getMaxSpeedLimit()+
				"Min Speed limit " + getMinSpeedLimit() + "Cars on road: " + getCarsOnRoad();
	}
	public void addCarToHighWay (Car newCar) {
		carsOnRoad.add(newCar);
		
	}
	
	public void removeCarFromHighWay (Car objectCar) {
		carsOnRoad.remove(objectCar);
	}
	//list of cars below speed
	
	public ArrayList <Car> belowSpeedLimit (){
		ArrayList <Car> belowSpeedLimit = new ArrayList <Car> ();
		for (Car cars : carsOnRoad) {
			if (cars.getCurrentSpeed()< minSpeedLimit){
			belowSpeedLimit.add(cars);	}
			
			}
		return belowSpeedLimit;
	}
	
	//list of cars for above speed limit
	
	public ArrayList <Car> aboveSpeedLimit (){
		ArrayList <Car> aboveSpeedLimit = new ArrayList <Car> ();
			for (Car cars : carsOnRoad) {
				if (cars.getCurrentSpeed()> maxSpeedLimit) {
					aboveSpeedLimit.add(cars);}
			}
				return aboveSpeedLimit;
	}
	//list of cars stopped in highway
	
	public ArrayList <Car> carsStoppedOnHighway(){
		ArrayList <Car> carsStoppedOnHighway = new ArrayList <Car>();{
			for (Car cars : carsOnRoad) {
				if (cars.getOffEngine()) {
					carsStoppedOnHighway.add(cars);
				}
			}
			
			return carsStoppedOnHighway;
			
		}
	}
}
