package OOP_Exercise_3;

public class Bird extends Animal{

	String type;
	
	public Bird () {
		super();
		this.type=type;
	}
	public Bird (String type, String name,int age, boolean sleepy) {
		super(name, age, sleepy);
	}
	public String  getType() {
		return type;
	}
	public void setType (String newType) {
		type = newType;
	}
	
	public String getName () {//it means that I'm overriding the method in class Animal getName
		return "Bird " + super.getName();//instead of null -I have to return the name what I want
	}//how can i get the same data that i actually returns
//this method is exact same method as a super class;
//only basically on the class bird, when i use the getName method before it prints name of that bird
//it's gonna print the word "Bird", it's gonna only do it that for this class, not for dog or cat class
}



