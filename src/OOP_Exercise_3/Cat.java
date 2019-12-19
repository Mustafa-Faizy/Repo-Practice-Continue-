package OOP_Exercise_3;

public class Cat extends Animal{
	
	int category;
	public Cat () {
		super();
		this.category=category;
	}
	public Cat (int category, String name, int age, boolean sleepy ) {
		super(name, age, sleepy);
	}
	public int getCategory () {
		return category;
	}
	public void setCategory (int newCategory) {
		category = newCategory;
	}
	//@Override//we override toString which comes from super class object and 
	//change that to return a String that we want, which is the variables of that class
	//public String toString () {
	//	return "Cat [getName()= " + getName() +
	//			", getAge()"+ getAge() + ",isSleepy()="+
	//	getSleepy() +"]";
	//}
	
	@Override 
	public String toString () {
		if (getSleepy()) {
		return "Cat [getName()=" + getName() + 
				"	"+ "getAge()"+ getAge() +  
				"This cat is sleepy"+"]";
	}
		else {
			return "Cat [getName()=" + getName() + 
			"	"+ "getAge()"+ getAge() +  
			" The cat is sharp as a cat would get"+getSleepy () + "]";
			
			}
		}

}
