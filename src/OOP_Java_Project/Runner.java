package OOP_Java_Project;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		HighWay hw95 = new HighWay("Highway 95", 100, 70);
		HighWay hw65 = new HighWay("Highway 65", 90, 50);
		HighWay hw75 = new HighWay("Highway 75", 120, 90);
		HighWay hw85 = new HighWay("Highway 85", 60, 40);
		HighWay hw55 = new HighWay("Highway 55", 140, 90);
		
		
		Car c001 = new Car("Toyota", "Corolla", "Sedan", 120, 2013, "Jack", 1.8, 65, true);
	    Car c002= new Car("Toyota", "Camry", "Sedan", 150, 2015, "Anzargul", 2.5, 68, true);
	    Car c003= new Car("Honda", "Civ", "Sedan", 250, 2015, "Bob", 3.5, 120, false);
	    Car c004= new Car("Hyundai", "Sanata", "Sedan", 100, 2015, "Tim", 4.5, 73, true);
	    Car c005= new Car("Mercedes", "SSC", "Sedan", 180, 2018, "Safi", 3.5, 120, true);
	    Car c006= new Car("BMw", "MM", "Sedan", 130, 2015, "Gul", 2.5, 75, false);
	    Car c007= new Car("Toyota", "Camry", "Sedan", 150, 2019, "Anzar", 8.5, 72, true);
	    Car c008= new Car("Nissan", "Sunny", "Sedan", 150, 2019, "Tapchangul", 5.5, 110, true);
	    Car c009= new Car("BmW", "BM", "Sedan", 250, 2017, "Oraz", 7.5, 105, false);
	    Car c010= new Car("Lexus", "SWR", "Sedan", 250, 2018, "Juma", 6.5, 68, false);
	//Add the cars to the highways.
	    hw95.addCarToHighWay(c001);
	    hw95.addCarToHighWay(c002);
	    hw95.addCarToHighWay(c003);
	    hw95.addCarToHighWay(c004);
	    hw95.addCarToHighWay(c009);
	    hw95.addCarToHighWay(c010);
	    
	    hw75.addCarToHighWay(c005);
	    hw75.addCarToHighWay(c006);
	    
	    hw85.addCarToHighWay(c007);
	    hw85.addCarToHighWay(c008);
	    
	        
	    
	    //Test all of the Custom methods of highway
	    //and make sure that all of them works fine. 
	   
	    System.out.println("********Cars on road*********\n");
	    for (Car cr : hw95.getCarsOnRoad()) {
	    	System.out.println(cr);
	    }
	    
	    for (Car cr : hw75.getCarsOnRoad()) {
	    	System.out.println(cr);
	}
	    for (Car cr : hw85.getCarsOnRoad()) {
	    	System.out.println(cr);
	}
	    System.out.println("*****remove one car from HighWay*******\n");
	    
	    hw95.removeCarFromHighWay(c001);
	    System.out.println(hw95.getCarsOnRoad());

	
	
	System.out.println("********Cars with below Speed limit******\n");
	for (Car cars : hw95.belowSpeedLimit()) {
		System.out.println(cars);
	}
		
	
	System.out.println("******Cars with above Speed LImit****** \n");
	for (Car cars : hw95.aboveSpeedLimit()) {
		System.out.println(cars);
	}
	
	System.out.println("*******Cars stopped on the Highway********\n");
	
	for (Car cars : hw95.carsStoppedOnHighway()) {
		if (cars.getStartEngine()) {
		System.out.println("Cars on Road");}
		else {
			System.out.println(cars);
		}
	}
	
	
	//Break a bit and break methods
	System.out.println(c001.breakABit());
	System.out.println(c002.getBreak());
	
	//Start and Off engine methods
	System.out.println(c003.getStartEngine());
	System.out.println(c004.getOffEngine());
	
	
	//Speed up method
	c001.speedUp(10);
	System.out.println(c001);
	
	//Polymorphism
	ArrayList <Vehicle> cars = new ArrayList <Vehicle>();
	Vehicle v1 = new Car("Toyota", "Corolla", 200, "Jack", 2.5, 62, true);
	Vehicle v2 = new Bike("BMx", "123", 60 , "Bob");
	Vehicle v3 = new Sedan("BMW", "BMW", 200, "Tim", 2.5, 75, false);
	
	cars.add(v1);
	cars.add(v2);
	cars.add(v3);
	
	for (Vehicle vh : cars) {
		System.out.println(cars.toString());
	}

}
}
