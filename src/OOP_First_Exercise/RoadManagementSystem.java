package OOP_First_Exercise;

public class RoadManagementSystem {
	
public static void main(String[] args) {
	
	HighWay hw95 = new HighWay("Highway 95", 65);
	HighWay hw66 = new HighWay("Highway 66", 72);
	
	Car car001= new Car("Honda", "Civic", 2019, "blue", "Sedan", "Jack Ma", 1, 65
			);
    Car car002 = new Car("Toyota", "Corolla", 2015, "black", "Sedan", "Anzargul", 2, 54);
    
	hw66.addcarsOfRoad(car001);
	hw66.addcarsOfRoad(car002);
	
	//method go to through the list of cars on the way
	//print the cars are not over the speed limit
	//hw66.getOverSpeed(); // this give me cars overspeed 
	
	//i like to print this list//I have to creat for loop of list
	
	for (Car cr : hw66.getOverSpeed()) {
		System.out.println(cr.getOwnerName()+ "with a "+cr.getModel()+"/" +cr.getColor()+ "is speeding with "
	+cr.getCurrentSpeed() + "mph in a highway that has "+ hw66.getSpeedLimit()+ "mph limit. \n *All units! Stop the Car!!!");
	}
	
}
}
