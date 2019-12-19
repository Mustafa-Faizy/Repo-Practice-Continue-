package OOP_Car_Exercise_feulInTank;

public class Car {
	
	String color;
	String form;
	double engineV;
	double fuelConsumption; //consumption per 100 km
	String id;
	double fuelInTank; //residue of tank
	
	public Car (String color, String form, double engineV, double fuelConsumption,
			String id, double fuelInTank) {
		this.color = color;
		this.form=form;
		this.fuelConsumption = fuelConsumption;
		this.id = id;
		this.fuelInTank= fuelInTank;
		
	}
	
	public String getColor () {
		return color;	
	}
	
	public void setColor (String newColor) {
		color = newColor;
	}
	
	public String getform () {
		return form;	
	}
	
	public void setform (String newForm) {
		form = newForm;
	}
	public double getEngineV () {
		return engineV;	
	}
	
	public void setEngineV (double newEngineV) {
		engineV = newEngineV;
	}
	public double getfuelConsumption () {
		return fuelConsumption;	
	}
	
	public void setfuelConsumption (double newfuelConsumption) {
		fuelConsumption = newfuelConsumption;
	}
	public String getid () {
		return id;	
	}
	
	public void setid (String newid) {
		id = newid;
	}
	public double getfuelInTank () {
		return fuelInTank;	
	}
	
	public void setfuelInTank (double newfuelInTank) {
		fuelInTank = newfuelInTank;
	}
	
	//refuel car //fuel Volume
	public void fillInTank (int fuelV ) {
		fuelInTank = fuelInTank + fuelV;
			} 
	//drive the distance
	 public void drive (double distance) {
		 fuelInTank = fuelInTank - distance/100*fuelConsumption;
	 }

}
