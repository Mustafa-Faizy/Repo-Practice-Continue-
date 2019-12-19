package OOP_Exercise_3;

public class Animal {
	
	private String name;
	private int age;
	private boolean sleepy;
	
	public Animal () {
		this.name="";
		this.age=0;
		this.sleepy=false;
	}
	
	public Animal (String name, int age, boolean sleepy) {
		this.name=name;
		this.age=age;
		this.sleepy=sleepy;
	}
	public String getName () {
		return name;
	}
	public void setName (String newName) {
		name=newName;
	}

	public int getAge () {
		return age;
	}
	public void setAge (int newAge) {
		age=newAge;
	}
	public boolean getSleepy () {
		return sleepy;
	}
	public void setSleepy (boolean newSleepy) {
		sleepy=newSleepy;
	}
	
	
}
