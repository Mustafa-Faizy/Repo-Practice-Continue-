package OOP_Java_Project;

public class Vehicle {

	//Name, make, model, max speed, year, owner
	private String name;
    private String make; 
    private String model;
    private int maxSpeed;
    private int year;
    private String owner;
    
    public Vehicle () {
    	this.name="";
    	this.make="";
    	this.model="";
    	this.maxSpeed = 0;
    	this.year=0;
    	this.owner="";
    	
    }
    public Vehicle (String name, String make, String model ,int maxSpeed,
    		int year, String owner) {
    	
        	this.name=name;
        	this.make=make;
        	this.model=model;
        	this.maxSpeed = maxSpeed;
        	this.year=year;
        	this.owner=owner;
    }
    public Vehicle (String name,  String model ,int maxSpeed,
    		String owner) {
    	
        	this.name=name;
        	this.model=model;
        	this.maxSpeed = maxSpeed;
        	this.owner=owner;
}
    public String getName () {
    	return name;
    }
    public void setName (String name) {
    	this.name=name;
    }
    public String getMake () {
    	return make;
    }
    public void setMake (String make) {
    	this.make=make;
    }
    public String getModel () {
    	return model;
    }
    public void setModel (String model) {
    	this.model=model;
    }
    public  int getMaxSpeed () {
    	return maxSpeed;
    }
    public void setMaxSpeed (int maxSpeed) {
    	this.maxSpeed=maxSpeed;
    }
    public int getYear () {
    	return year;
    }
    public void setYear (int year) {
    	this.year=year;
    }
    public String getOwner () {
    	return owner;
    }
    public void setOwner (String owner) {
    	this.owner=owner;
    }
}
