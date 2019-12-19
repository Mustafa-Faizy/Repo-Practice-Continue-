package OOP_Exercise_3;

public class Dog extends Animal{

	private String color;
	public Dog () {
		super();
		this.color="";
	}
	private static int countOfDogs;//static variable
	public Dog (String color, String name, int age, boolean sleepy) {
		super(name, age, sleepy);
		//this.countOfDogs=count;
		countOfDogs++;
	}
	public String getColor () {
		return color;
	}
	public void setColor (String newColor) {
		color=newColor;
	}
	public int getCount () {
		return countOfDogs;
	}
	
}
