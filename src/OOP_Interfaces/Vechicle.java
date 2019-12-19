package OOP_Interfaces;

public interface Vechicle {//they are not classes, different identity
	
	//every vehicle should have a method break and start engine
	
	//works like contract. 
	//definition of method and implementation(performance)

	
	public void startEngine ();
	
	public double getCurrentSpeed();//return
	
	public void changeSpeed (double newSpeed);
}
