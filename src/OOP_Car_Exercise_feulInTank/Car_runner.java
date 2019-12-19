package OOP_Car_Exercise_feulInTank;

public class Car_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car ("pink", "sedan", 1.8, 6,  "Pinky", 0);
		myCar.fuelInTank = 10;	
		myCar.fillInTank(20);//fuel Volume
		
		System.out.println("current fuel level " + myCar.getfuelInTank());

		//drive the distance + fuelInTank after driving
		myCar.drive(23.3);
		myCar.getfuelInTank();
		
		System.out.println("My Car has fuel in Tank "+ myCar.getfuelInTank() );
		
		
}
}
